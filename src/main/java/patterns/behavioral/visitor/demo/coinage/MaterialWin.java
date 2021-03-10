package patterns.behavioral.visitor.demo.coinage;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class MaterialWin extends JFrame implements ItemListener {
  JPanel centerJP;
  SetMaterial os;    //材料集对象
  Company visitor1, visitor2;    //访问者对象
  String[] select;
  private ClassLoader loader;

  public MaterialWin() {
    super("利用访问者模式设计艺术公司和造币公司");
    loader = this.getClass().getClassLoader();
    JRadioButton Art;
    JRadioButton mint;
    os = new SetMaterial();
    os.add(new Copper());
    os.add(new Paper());
    visitor1 = new ArtCompany();//艺术公司
    visitor2 = new Mint(); //造币公司
    this.setBounds(10, 10, 750, 350);
    this.setResizable(false);
    centerJP = new JPanel();
    this.add("Center", centerJP);
    JPanel SouthJP = new JPanel();
    JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
    Art = new JRadioButton("艺术公司", true);
    mint = new JRadioButton("造币公司");
    Art.addItemListener(this);
    mint.addItemListener(this);
    ButtonGroup group = new ButtonGroup();
    group.add(Art);
    group.add(mint);
    SouthJP.add(yl);
    SouthJP.add(Art);
    SouthJP.add(mint);
    this.add("South", SouthJP);
    select = (os.accept(visitor1)).split(" ");    //获取产品名
    showPicture(select[0], select[1]);    //显示产品
  }
  //显示图片
  void showPicture(String cuprum, String paper) {
    centerJP.removeAll();    //清除面板内容
    centerJP.repaint();    //刷新屏幕
    String fileName1 = "behavioral/visitor/demo/coinage/" + cuprum + ".jpg";
    String fileName2 = "behavioral/visitor/demo/coinage/" + paper + ".jpg";
    JLabel lb = new JLabel(new ImageIcon(loader.getResource(fileName1)), JLabel.CENTER);
    JLabel rb = new JLabel(new ImageIcon(loader.getResource(fileName2)), JLabel.CENTER);
    centerJP.add(lb);
    centerJP.add(rb);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    JRadioButton jc = (JRadioButton) e.getSource();
    if (jc.isSelected()) {
      if (jc.getText().equals("造币公司")) {
        select = (os.accept(visitor2)).split(" ");
      } else {
        select = (os.accept(visitor1)).split(" ");
      }
      showPicture(select[0], select[1]);    //显示选择的产品
    }
  }
}

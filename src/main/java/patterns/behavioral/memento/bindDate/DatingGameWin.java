package patterns.behavioral.memento.bindDate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class DatingGameWin extends JFrame implements ActionListener {
  private JPanel centerJP, eastJP;
  private JRadioButton girl1, girl2, girl3, girl4;
  private JButton button1, button2;
  private String fileName;
  private JLabel g;
  private  Yourself you;
  private GirlStack girls;
  private ClassLoader loader;

  public DatingGameWin()  {
    super("利用备忘录模式设计相亲游戏");
    loader = this.getClass().getClassLoader();
    you = new Yourself();
    girls = new GirlStack();
    this.setBounds(0, 0, 900, 380);
    this.setResizable(false);
    fileName = "behavioral/memento/demo/四大美女.jpg";
    g = new JLabel(new ImageIcon(loader.getResource(fileName)), JLabel.CENTER);
    centerJP = new JPanel();
    centerJP.setLayout(new GridLayout(1, 4));
    centerJP.setBorder(BorderFactory.createTitledBorder("四大美女如下："));
    centerJP.add(g);
    this.add("Center", centerJP);
    eastJP = new JPanel();
    eastJP.setLayout(new GridLayout(1, 1));
    eastJP.setBorder(BorderFactory.createTitledBorder("您选择的爱人是："));
    this.add("East", eastJP);
    JPanel SouthJP = new JPanel();
    JLabel info = new JLabel("四大美女有“沉鱼落雁之容、闭月羞花之貌”，您选择谁？");
    girl1 = new JRadioButton("西施", true);
    girl2 = new JRadioButton("貂蝉");
    girl3 = new JRadioButton("王昭君");
    girl4 = new JRadioButton("杨玉环");
    button1 = new JButton("确定");
    button2 = new JButton("返回");
    ButtonGroup group = new ButtonGroup();
    group.add(girl1);
    group.add(girl2);
    group.add(girl3);
    group.add(girl4);
    SouthJP.add(info);
    SouthJP.add(girl1);
    SouthJP.add(girl2);
    SouthJP.add(girl3);
    SouthJP.add(girl4);
    SouthJP.add(button1);
    SouthJP.add(button2);
    button1.addActionListener(this);
    button2.addActionListener(this);
    this.add("South", SouthJP);
    showPicture("空白");
    you.setGirlName("空白");
    girls.push(you.holdingGirl());    //保存状态
  }
  //显示图片
  void showPicture(String name) {
    eastJP.removeAll(); //清除面板内容
    eastJP.repaint(); //刷新屏幕
    you.setGirlName(name);
    fileName = "behavioral/memento/demo/" + name + ".jpg";
    g = new JLabel(new ImageIcon(loader.getResource(fileName)), JLabel.CENTER);
    eastJP.add(g);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    boolean ok = false;
    if (e.getSource() == button1) {
      ok = girls.push(you.holdingGirl());    //保存状态
      if (ok && girl1.isSelected()) {
        showPicture("西施");
      } else if (ok && girl2.isSelected()) {
        showPicture("貂蝉");
      } else if (ok && girl3.isSelected()) {
        showPicture("王昭君");
      } else if (ok && girl4.isSelected()) {
        showPicture("杨玉环");
      }
    } else if (e.getSource() == button2) {
      you.restoreHoldingGirl(girls.pop()); //恢复状态
      showPicture(you.getGirlName());
    }
  }
}

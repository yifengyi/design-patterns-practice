package patterns.creational.factoryMethod.demo.animalFarm;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Cattle implements Animal {
  private JFrame jf;

  public Cattle() {
    jf = new JFrame("工厂模式测试");
    Container container = jf.getContentPane();
    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(1,1));
    jp.setBorder(BorderFactory.createTitledBorder("动物：牛"));
    JScrollPane jsp = new JScrollPane(jp);
    container.add(jsp, BorderLayout.CENTER);
    URL url = this.getClass().getClassLoader().getResource("creational/factoryMethod/demo/animalFarm/A_Cattle.jpg");
    JLabel jl = new JLabel(new ImageIcon(url));
    jp.add(jl);
    jf.pack();
    jf.setVisible(false);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //用户点击窗口关闭
  }

  @Override
  public void show() {
    jf.setVisible(true);
  }
}

package patterns.creational.abstractFactory.demo.farm;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Cattle implements Animal {
  private JFrame jf ;
  public Cattle() {
    jf = new JFrame("抽象工厂模式测试");
    Container container = jf.getContentPane();
    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(1, 1));
    jp.setBorder(BorderFactory.createTitledBorder("动物：牛"));
    JScrollPane jsp = new JScrollPane(jp);
    container.add(jsp, BorderLayout.CENTER);
    URL url = this.getClass().getClassLoader().getResource("creational/abstractFactory/demo/farm/A_Cattle.jpg");
    JLabel jl = new JLabel(new ImageIcon(url));
    jp.add(jl);
    jf.pack();
    jf.setVisible(false);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void show() {
    jf.setVisible(true);
  }
}

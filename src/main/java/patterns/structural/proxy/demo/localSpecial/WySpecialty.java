package patterns.structural.proxy.demo.localSpecial;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class WySpecialty extends JFrame implements Specialty {
  public WySpecialty() {
    super("韶关代理婺源特产测试");
    this.setLayout(new GridLayout(1, 1));
    URL url = this.getClass().getClassLoader().getResource("structural/proxy/demo/localSpecial/WuyuanSpecialty.jpg");
    JLabel l1 = new JLabel(new ImageIcon(url));
    this.add(l1);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


  @Override
  public void display() {
    this.setVisible(true);
  }
}

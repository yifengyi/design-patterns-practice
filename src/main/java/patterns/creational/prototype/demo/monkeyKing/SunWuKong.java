package patterns.creational.prototype.demo.monkeyKing;

import javax.swing.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class SunWuKong extends JPanel implements Cloneable {
  public SunWuKong()  {
    URL url = this.getClass().getClassLoader().getResource("creational/prototype/demo/monkeyKing/Wukong.jpg");
    JLabel jl = new JLabel(new ImageIcon(url));
    this.add(jl);
  }

  @Override
  public  Object clone()  {
    SunWuKong w = null;
    try {
      w = (SunWuKong) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("拷贝悟空失败!");
    }
    return w;
  }
}

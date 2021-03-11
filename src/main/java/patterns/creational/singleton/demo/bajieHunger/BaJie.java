package patterns.creational.singleton.demo.bajieHunger;

import javax.swing.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class BaJie extends JPanel {
  private static BaJie baJie = new BaJie();

  private BaJie() {
    URL url = this.getClass().getClassLoader().getResource("creational/singleton/demo/bajieHunger/Bajie.jpg");
    JLabel label = new JLabel(new ImageIcon(url));
    this.add(label);
  }

  public static BaJie getInstance(){
    return baJie;
  }
}

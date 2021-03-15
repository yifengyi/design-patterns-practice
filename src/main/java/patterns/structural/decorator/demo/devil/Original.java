package patterns.structural.decorator.demo.devil;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * //具体构件角色：原身
 * 1.0v created by wujf on 2021-3-15
 */
public class Original extends JFrame implements Morrigan {
  private String t = "Morrigan0.jpg";

  public Original() {
    super("《恶魔战士》中的莫莉卡·安斯兰");
  }

  public void setT(String t) {
    this.t = t;
  }

  @Override
  public void display() {
    this.setLayout(new FlowLayout());
    URL url = this.getClass().getClassLoader().getResource("structural/decorator/demo/devil/"+t);
    JLabel l1 = new JLabel(new ImageIcon(url));
    this.add(l1);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}

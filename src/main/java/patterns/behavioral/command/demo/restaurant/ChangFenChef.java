package patterns.behavioral.command.demo.restaurant;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ChangFenChef extends JFrame {
  private JLabel label = new JLabel();

  public ChangFenChef()  {
    super("煮肠粉");
    label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("behavioral/command/demo/restaurant/ChangFen.jpg")));
    this.add(label);
    this.setLocation(30, 30);
    this.pack();
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public  void cooking(){
    this.setVisible(true);
  }
}

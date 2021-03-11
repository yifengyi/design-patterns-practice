package patterns.creational.builder.demo.parlourFixtures;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 客厅
 * 1.0v created by wujf on 2021-3-11
 */
public class Parlour {
  private String wall;
  private String TV;
  private String sofa;

  public void setWall(String wall) {
    this.wall = wall;
  }

  public void setTV(String TV) {
    this.TV = TV;
  }

  public void setSofa(String sofa) {
    this.sofa = sofa;
  }

  public void show(){
    JFrame jf = new JFrame("建造者模式测试");
    Container contentPane = jf.getContentPane();
    JPanel p = new JPanel();
    JScrollPane sp = new JScrollPane(p);
    String parlour ="creational/builder/demo/parlourFixtures/" +wall + TV + sofa+".jpg";
    System.out.println(parlour);
    URL url = this.getClass().getClassLoader().getResource(parlour);
    JLabel l = new JLabel(new ImageIcon(url));
    p.setLayout(new GridLayout(1, 1));
    p.setBorder(BorderFactory.createTitledBorder("客厅"));
    p.add(l);
    contentPane.add(sp, BorderLayout.CENTER);
    jf.pack();
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

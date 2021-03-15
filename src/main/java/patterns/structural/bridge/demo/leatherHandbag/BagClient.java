package patterns.structural.bridge.demo.leatherHandbag;

import patterns.creational.factoryMethod.demo.util.ReadXML;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class BagClient {
  public static void main(String[] args) {
    Color color;
    Bag bag;
    String path = "structural/bridge/leatherHandbag/config.xml";
    String clazz = "patterns.structural.bridge.demo.leatherHandbag.Yellow";
    String clazz2= "patterns.structural.bridge.demo.leatherHandbag.HandBag";
    color = (Color) ReadXML.getObjectByName(path,clazz);
    bag = (Bag) ReadXML.getObjectByName(path,clazz2);
    bag.setColor(color);
    String name = bag.getName();
    show(name);
  }
  public static void show(String name) {
    JFrame jf = new JFrame("桥接模式测试");
    Container contentPane = jf.getContentPane();
    JPanel p = new JPanel();
    String path = "structural/bridge/leatherHandbag/" + name + ".jpg";
    URL url = BagClient.class.getClassLoader().getResource(path);
    JLabel l = new JLabel(new ImageIcon(url));
    p.setLayout(new GridLayout(1, 1));
    p.setBorder(BorderFactory.createTitledBorder("女士皮包"));
    p.add(l);
    contentPane.add(p, BorderLayout.CENTER);
    jf.pack();
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

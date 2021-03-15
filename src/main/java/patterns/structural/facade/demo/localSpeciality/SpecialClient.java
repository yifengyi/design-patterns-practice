package patterns.structural.facade.demo.localSpeciality;

import javax.swing.*;
import java.awt.*;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class SpecialClient {
  public static void main(String[] args) {
    JFrame f = new JFrame("外观模式: 婺源特产选择测试");
    Container cp = f.getContentPane();
    WySpecialty wys = new WySpecialty();
    JScrollPane treeView = new JScrollPane(wys.tree);
    JScrollPane scrollpane = new JScrollPane(wys.label);
    JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, treeView, scrollpane); //分割面版
    splitpane.setDividerLocation(230);     //设置splitpane的分隔线位置
    splitpane.setOneTouchExpandable(true); //设置splitpane可以展开或收起
    cp.add(splitpane);
    f.setSize(650, 350);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

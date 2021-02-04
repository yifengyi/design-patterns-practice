package patterns.structural.flyweight.practice.trees;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class TreeType {
  private String name;
  private Color color;
  private String othereTreeData;

  public TreeType(String name, Color color, String othereTreeData) {
    this.name = name;
    this.color = color;
    this.othereTreeData = othereTreeData;
  }
  public void draw(Graphics g,int x,int y){
    g.setColor(Color.BLACK);
    g.fillRect(x-1,y,3,5);
    g.setColor(color);
    g.fillOval(x-5,y-10,10,10);
  }
}

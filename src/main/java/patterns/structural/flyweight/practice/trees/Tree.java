package patterns.structural.flyweight.practice.trees;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Tree {
  private int x;
  private int y;

  private TreeType type;

  public Tree(int x, int y, TreeType type) {
    this.x = x;
    this.y = y;
    this.type = type;
  }
  public void draw(Graphics g){
    type.draw(g,x,y);
  }
}

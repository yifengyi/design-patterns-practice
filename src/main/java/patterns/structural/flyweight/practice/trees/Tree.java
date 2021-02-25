package patterns.structural.flyweight.practice.trees;

import java.awt.*;

/**
 * // 情景对象包含树状态的外在部分。程序中可以创建数十亿个此类对象，因为它们
 * // 体积很小：仅有两个整型坐标和一个引用成员变量。
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

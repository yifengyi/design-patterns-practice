package patterns.behavioral.visitor.practice.shapes;

import patterns.behavioral.visitor.practice.visitor.Visitor;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class Dot implements Shape {
  private int id;
  private int x;
  private int y;

  public Dot() {
  }

  public Dot(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int x, int y) {
    // move shape
  }

  @Override
  public void draw() {
    // draw shape
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitDot(this);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getId() {
    return id;
  }
}

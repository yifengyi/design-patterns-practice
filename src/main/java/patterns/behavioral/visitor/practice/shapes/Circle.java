package patterns.behavioral.visitor.practice.shapes;

import patterns.behavioral.visitor.practice.visitor.Visitor;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class Circle extends Dot {
  private int radius;

  public Circle(int id, int x, int y, int radius) {
    super(id, x, y);
    this.radius = radius;
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitCircle(this);
  }

  public int getRadius() {
    return radius;
  }
}

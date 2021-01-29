package patterns.creational.prototype.practice.shapes;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public abstract class Shape {
  public int    x;
  public int    y;
  public String color;

  public Shape() {
  }

  public Shape(Shape target) {
    if (target != null) {
      this.x = target.x;
      this.y = target.y;
      this.color = target.color;
    }
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Shape)) {
      return false;
    }
    Shape shape = ((Shape) obj);
    return shape.x == x
            && shape.y == y
            && Objects.equals(shape.color, color);
  }
}

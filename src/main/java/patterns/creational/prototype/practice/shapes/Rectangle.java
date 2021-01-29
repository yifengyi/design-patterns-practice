package patterns.creational.prototype.practice.shapes;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class Rectangle extends Shape {
  public int width;
  public int height;

  public Rectangle() {
  }

  public Rectangle(Rectangle target) {
    super(target);
    if (target != null) {
      this.width = target.width;
      this.height = target.height;
    }
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Rectangle)
            || !super.equals(obj)) {
      return false;
    }
    Rectangle rectangle = ((Rectangle) obj);

    return rectangle.width == width
            && rectangle.height == height;
  }
}

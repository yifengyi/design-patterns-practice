package patterns.creational.prototype.practice.shapes;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class Circle extends Shape {
  public int radius;

  public Circle() {
  }

  public Circle(Circle target){
    super(target);
    if (target != null) {
      this.radius = target.radius;
    }
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Circle)
            || !super.equals(obj)) {
      return false;
    }
    Circle circle = ((Circle) obj);
    return circle.radius==radius;
  }
}

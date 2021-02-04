package patterns.behavioral.memento.practice.shapes;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Circle extends BaseShape {
  private int radius;

  public Circle(int x, int y, int radius, Color color) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public int getWidth() {
    return radius * 2;
  }

  @Override
  public int getHeight() {
    return radius * 2;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
  }
}

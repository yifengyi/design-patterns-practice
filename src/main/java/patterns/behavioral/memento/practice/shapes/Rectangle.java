package patterns.behavioral.memento.practice.shapes;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Rectangle extends BaseShape {
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height, Color color) {
    super(x, y, color);
    this.width = width;
    this.height = height;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
  }
}

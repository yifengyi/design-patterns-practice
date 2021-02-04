package patterns.structural.composite.practice.shapes;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-2-2
 */
public interface Shape {
  int getX();

  int getY();

  int getWidth();

  int getHeight();

  void move(int x, int y);

  boolean isInsideBounds(int x, int y);

  void select();

  void unSelect();

  boolean isSelected();

  void paint(Graphics graphics);
}

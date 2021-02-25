package patterns.structural.composite.practice.shapes;

import java.awt.*;

/**
 *  叶节点类代表组合的终端对象。叶节点对象中不能包含任何子对象。叶节点对象
 *  通常会完成实际的工作，组合对象则仅会将工作委派给自己的子部件。
 * 1.0v created by wujf on 2021-2-2
 */
public class Dot extends BaseShape {
  private final  int DOT_SIZE = 3;

  public Dot(int x, int y, Color color) {
    super(x, y, color);
  }

  @Override
  public int getWidth() {
    return DOT_SIZE;
  }

  @Override
  public int getHeight() {
    return DOT_SIZE;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
  }
}

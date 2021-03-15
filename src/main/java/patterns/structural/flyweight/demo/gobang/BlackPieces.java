package patterns.structural.flyweight.demo.gobang;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class BlackPieces implements ChessPieces {
  @Override
  public void downPieces(Graphics g, Point pt) {
    g.setColor(Color.BLACK);
    g.fillOval(pt.x, pt.y, 30, 30);
  }
}

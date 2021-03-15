package patterns.structural.flyweight.demo.gobang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Chessboard extends MouseAdapter {
  WeiqiFactory wf;
  JFrame       f;
  Graphics     g;
  JRadioButton wz;
  JRadioButton bz;
  private final int x = 50;
  private final int y = 50;
  private final int w = 40;    //小方格宽度和高度
  private final int rw = 400;    //棋盘宽度和高度
 public Chessboard() {
    wf = new WeiqiFactory();
    f = new JFrame("享元模式在五子棋游戏中的应用");
    f.setBounds(100, 100, 500, 550);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel southJP = new JPanel();
    f.add("South", southJP);
    wz = new JRadioButton("白子");
    bz = new JRadioButton("黑子", true);
    ButtonGroup group = new ButtonGroup();
    group.add(wz);
    group.add(bz);
    southJP.add(wz);
    southJP.add(bz);
    JPanel centerJP = new JPanel();
    centerJP.setLayout(null);
    centerJP.setSize(500, 500);
    centerJP.addMouseListener(this);
    f.add("Center", centerJP);
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    g = centerJP.getGraphics();
    g.setColor(Color.BLUE);
    g.drawRect(x, y, rw, rw);
    for (int i = 1; i < 10; i++) {
      //绘制第i条竖直线
      g.drawLine(x + (i * w), y, x + (i * w), y + rw);
      //绘制第i条水平线
      g.drawLine(x, y + (i * w), x + rw, y + (i * w));
    }
  }
  @Override
  public void mouseClicked(MouseEvent e) {
    Point pt = new Point(e.getX() - 15, e.getY() - 15);
    if (wz.isSelected()) {
      ChessPieces c1 = wf.getChessPieces("w");
      c1.downPieces(g, pt);
    } else if (bz.isSelected()) {
      ChessPieces c2 = wf.getChessPieces("b");
      c2.downPieces(g, pt);
    }
  }
}

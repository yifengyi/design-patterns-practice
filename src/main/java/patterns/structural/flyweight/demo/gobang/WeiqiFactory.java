package patterns.structural.flyweight.demo.gobang;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class WeiqiFactory {
  private List<ChessPieces> qz;
  public WeiqiFactory() {
    qz = new ArrayList<ChessPieces>();
    ChessPieces w = new WhitePieces();
    qz.add(w);
    ChessPieces b = new BlackPieces();
    qz.add(b);
  }
  public ChessPieces getChessPieces(String type) {
    if (type.equalsIgnoreCase("w")) {
      return (ChessPieces) qz.get(0);
    } else if (type.equalsIgnoreCase("b")) {
      return (ChessPieces) qz.get(1);
    } else {
      return null;
    }
  }
}

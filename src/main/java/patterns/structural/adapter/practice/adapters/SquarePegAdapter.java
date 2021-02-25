package patterns.structural.adapter.practice.adapters;


import patterns.structural.adapter.practice.round.RoundPeg;
import patterns.structural.adapter.practice.square.SquarePeg;

/**
 * // 适配器类让你能够将方钉放入圆孔中。它会对 RoundPeg 类进行扩展，以接收适
 * // 配器对象作为圆钉。
 * 1.0v created by wujf on 2021-2-2
 */
public class SquarePegAdapter extends RoundPeg {
  // 在实际情况中，适配器中会包含一个 SquarePeg 类的实例。
  private SquarePeg peg;

  public SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    double result;
    // 适配器会假扮为一个圆钉，
    // 其半径刚好能与适配器实际封装的方钉搭配起来。
    result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));

    return result;
  }
}

package patterns.structural.adapter.practice.adapters;


import patterns.structural.adapter.practice.round.RoundPeg;
import patterns.structural.adapter.practice.square.SquarePeg;

/**
 * 1.0v created by wujf on 2021-2-2
 */
public class SquarePegAdapter extends RoundPeg {
  private SquarePeg peg;

  public SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    double result;

    result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));

    return result;
  }
}

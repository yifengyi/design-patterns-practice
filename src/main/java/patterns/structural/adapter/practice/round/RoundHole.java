package patterns.structural.adapter.practice.round;

/**
 * 1.0v created by wujf on 2021-2-2
 */
public class RoundHole {
  private double radius;

  public RoundHole(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
  public boolean fits(RoundPeg peg){
    boolean result;
    result = (this.getRadius() >= peg.getRadius());
    return result;
  }
}

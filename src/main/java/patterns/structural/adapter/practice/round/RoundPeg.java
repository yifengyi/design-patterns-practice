package patterns.structural.adapter.practice.round;

/**
 *
 * // 假设你有两个接口相互兼容的类：圆孔（Round­Hole）和圆钉（Round­Peg）。
 * 1.0v created by wujf on 2021-2-2
 */
public class RoundPeg {
  private double radius;

  public RoundPeg() {
  }

  public RoundPeg(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}

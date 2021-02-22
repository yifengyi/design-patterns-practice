package patterns.structural.adapter.practice.square;

/**
 * 方钉子
 * 1.0v created by wujf on 2021-2-2
 */
public class SquarePeg {
  private double width;

  public SquarePeg(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }
  public double getSquare(){
    double result;
    result = Math.pow(this.width, 2);
    return result;
  }
}

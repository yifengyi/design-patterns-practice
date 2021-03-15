package patterns.structural.bridge.demo.leatherHandbag;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public abstract class Bag {
  protected  Color color;

  public void setColor(Color color) {
    this.color = color;
  }
  public abstract String getName();
}

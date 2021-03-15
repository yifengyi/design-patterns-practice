package patterns.structural.bridge.demo.leatherHandbag;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class HandBag extends Bag {
  @Override
  public String getName() {
    return color.getColor() + "HandBag";
  }
}

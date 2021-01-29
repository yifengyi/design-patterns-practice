package patterns.creational.abstractFactory.practice.buttions;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class MacOSButton  implements Button{
  @Override
  public void paint() {
    System.out.println("You have created MacOSButton.");
  }
}

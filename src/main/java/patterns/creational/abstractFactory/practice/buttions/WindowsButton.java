package patterns.creational.abstractFactory.practice.buttions;

/**
 * // 具体产品由相应的具体工厂创建。
 * 1.0v created by wujf on 2021-1-29
 */
public class WindowsButton implements Button{
  @Override
  public void paint() {
    System.out.println("You have created WindowsButton.");
  }
}

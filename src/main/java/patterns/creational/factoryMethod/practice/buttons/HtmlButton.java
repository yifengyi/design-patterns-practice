package patterns.creational.factoryMethod.practice.buttons;

/**
 * // 具体产品需提供产品接口的各种实现。
 * 1.0v created by wujf on 2021-1-29
 * 具体产品：html按钮
 */
public class HtmlButton implements Button {
  @Override
  public void render() {
    System.out.println("<button>Test Button</button>");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("Click! Button says - 'Hello world!'");
  }
}

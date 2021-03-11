package patterns.creational.abstractFactory.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ConcreteFactory2 implements AbstractFactory {
  @Override
  public ProductA newProductA() {
    System.out.println("具体工厂 2 生成-->具体产品 A2...");
    return new ConcreteProductA2();
  }

  @Override
  public ProductB newProductB() {
    System.out.println("具体工厂 2 生成-->具体产品 B2...");
    return new ConcreteProductB2();
  }
}

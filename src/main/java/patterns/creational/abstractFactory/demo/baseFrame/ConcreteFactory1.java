package patterns.creational.abstractFactory.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public ProductA newProductA() {
    System.out.println("具体工厂 1 生成-->具体产品 A1...");
    return new ConcreteProductA1();
  }

  @Override
  public ProductB newProductB() {
    System.out.println("具体工厂 1 生成-->具体产品 B1...");
    return new ConcreteProductB1();
  }
}

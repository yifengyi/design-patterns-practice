package patterns.creational.factoryMethod.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public Product newProduct() {
    System.out.println("具体工厂1生成-->具体产品1...");
    return new ConcreteProduct1();
  }
}

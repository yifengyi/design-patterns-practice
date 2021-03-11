package patterns.creational.builder.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ConcreteBuilder1 extends Builder {
  @Override
  public void buildPartA() {
    product.setPartA("建造 PartA");
  }

  @Override
  public void buildPartB() {
    product.setPartB("建造 PartA");
  }

  @Override
  public void buildPartC() {
    product.setPartC("建造 PartA");
  }
}

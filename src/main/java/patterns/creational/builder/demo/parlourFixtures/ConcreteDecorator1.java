package patterns.creational.builder.demo.parlourFixtures;

/**
 * 具体建造者：具体装修工人1
 * 1.0v created by wujf on 2021-3-11
 */
public class ConcreteDecorator1 extends Decorator {
  @Override
  public void buildWall() {
    parlour.setWall("w1");
  }

  @Override
  public void buildTV() {
    parlour.setTV("TV1");
  }

  @Override
  public void buildSofa() {
    parlour.setSofa("sf1");
  }
}

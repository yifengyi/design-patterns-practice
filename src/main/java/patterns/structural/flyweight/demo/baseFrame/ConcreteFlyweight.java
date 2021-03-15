package patterns.structural.flyweight.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class ConcreteFlyweight implements Flyweight {
  private String key;

  public ConcreteFlyweight(String key) {
    this.key = key;
    System.out.println("具体享元" + key + "被创建！");
  }

  @Override
  public void operation(UnsharedConcreteFlyweight flyweight) {
    System.out.print("具体享元" + key + "被调用，");
    System.out.println("非享元信息是:" + flyweight.getInfo());
  }
}

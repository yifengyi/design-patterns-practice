package patterns.structural.flyweight.demo.baseFrame;

/**
 * 享元模式的主要角色有如下。
 *  1.抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 *  2.具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 *  3.非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 *  4.享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 * 1.0v created by wujf on 2021-3-15
 */
public class TestClient {
  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight f01 = factory.getFlyweight("a");
    Flyweight f02 = factory.getFlyweight("a");
    Flyweight f03 = factory.getFlyweight("a");
    Flyweight f11 = factory.getFlyweight("b");
    Flyweight f12 = factory.getFlyweight("b");
    f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
    f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
    f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
    f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
    f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
  }
}

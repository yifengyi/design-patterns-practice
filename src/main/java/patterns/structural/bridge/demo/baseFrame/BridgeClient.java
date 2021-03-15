package patterns.structural.bridge.demo.baseFrame;

/**
 * 桥接（Bridge）模式包含以下主要角色。
 *  1. 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 *  2.扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *  3.实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 *  4.具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 * 1.0v created by wujf on 2021-3-15
 */
public class BridgeClient {
  public static void main(String[] args) {
    Implementor imple = new ConcreteImplementorA();
    Abstraction abs = new RefinedAbstraction(imple);
    abs.operation();
  }
}

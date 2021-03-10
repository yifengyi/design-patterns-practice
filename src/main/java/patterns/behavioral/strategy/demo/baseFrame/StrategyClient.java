package patterns.behavioral.strategy.demo.baseFrame;

/**
 * 策略模式的主要角色如下。
 *  1.抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 *  2.具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 *  3.环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 * 1.0v created by wujf on 2021-3-10
 */
public class StrategyClient {
  public static void main(String[] args) {
    Context c = new Context();
    Strategy s = new ConcreteStrategy1();
    c.setStrategy(s);
    c.strategyMethod();
    System.out.println("-----------------");
    s = new ConcreteStartegy2();
    c.setStrategy(s);
    c.strategyMethod();
  }
}

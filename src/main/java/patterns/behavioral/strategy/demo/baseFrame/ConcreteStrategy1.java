package patterns.behavioral.strategy.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteStrategy1 implements Strategy {
  @Override
  public void strategyMethod() {
    System.out.println("策略1方法被访问");
  }
}

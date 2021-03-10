package patterns.behavioral.strategy.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Context {
  private Strategy strategy;

  public Strategy getStrategy() {
    return strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void strategyMethod(){
    strategy.strategyMethod();
  }
}

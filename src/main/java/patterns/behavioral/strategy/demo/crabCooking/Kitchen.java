package patterns.behavioral.strategy.demo.crabCooking;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Kitchen {
  private CrabCooking strategy;

  public CrabCooking getStrategy() {
    return strategy;
  }

  public void setStrategy(CrabCooking strategy) {
    this.strategy = strategy;
  }

  public void cooking(){
    strategy.cookingMethod();
  }
}

package patterns.behavioral.strategy.practice.strategies;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class Order {
  private int totalCost = 0;
  private boolean isClosed = false;

  public void processOrder(PayStrategy strategy) {
    strategy.collectPaymentDetails();
    // Here we could collect and store payment data from the strategy.
  }

  public void setTotalCost(int cost) {
    this.totalCost += cost;
  }

  public int getTotalCost() {
    return totalCost;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public void setClosed() {
    isClosed = true;
  }
}

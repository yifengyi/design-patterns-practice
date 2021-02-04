package patterns.behavioral.strategy.practice.strategies;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public interface PayStrategy {
  boolean pay(int paymentAmount);
  void collectPaymentDetails();
}

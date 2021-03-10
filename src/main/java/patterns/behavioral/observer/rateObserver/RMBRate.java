package patterns.behavioral.observer.rateObserver;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class RMBRate extends Rate {
  @Override
  public void change(int number) {
    for (Company company : companies) {
      company.response(number);
    }
  }
}

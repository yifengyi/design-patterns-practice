package patterns.behavioral.observer.rateObserver;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class RMBRateClient {
  public static void main(String[] args) {
    Rate rate = new RMBRate();
    Company watcher1 = new ImportCompany();
    Company watcher2 = new ExportCompany();
    rate.add(watcher1);
    rate.add(watcher2);
    rate.change(10);
    rate.change(-9);
  }
}

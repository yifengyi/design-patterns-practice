package patterns.behavioral.observer.demo;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class ConcreteSubject extends Subject {
  @Override
  public void notifyObserver() {
    System.out.println("具体目标发生改变...");
    System.out.println("--------------");
    for (Observer observer : observers) {
      observer.response();
    }
  }
}

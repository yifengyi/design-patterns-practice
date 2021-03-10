package patterns.behavioral.observer.demo;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class ConcreteObserver1 implements Observer {
  @Override
  public void response() {
    System.out.println("观察者1做出回应");
  }
}

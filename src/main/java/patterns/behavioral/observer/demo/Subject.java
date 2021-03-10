package patterns.behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public abstract class Subject {
  protected List<Observer> observers = new ArrayList<>();

  public void add(Observer observer){
    observers.add(observer);
  }

  public void remove(Observer observer){
    observers.remove(observer);
  }

  public abstract void notifyObserver();
}

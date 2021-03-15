package patterns.structural.adapter.demo.baseFrame.objectAdapter;

import patterns.structural.adapter.demo.baseFrame.Adaptee;
import patterns.structural.adapter.demo.baseFrame.Target;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class ObjectAdapter implements Target {
  private Adaptee adaptee;

  public ObjectAdapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }
}

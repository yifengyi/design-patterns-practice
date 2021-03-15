package patterns.structural.adapter.demo.baseFrame.classAdatper;

import patterns.structural.adapter.demo.baseFrame.Adaptee;
import patterns.structural.adapter.demo.baseFrame.Target;

/**
 *
 *
 * 1.0v created by wujf on 2021-3-15
 */
public class ClassAdapter extends Adaptee implements Target {
  @Override
  public void request() {
    specificRequest();
  }
}

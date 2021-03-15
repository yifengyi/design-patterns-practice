package patterns.structural.adapter.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class TwoWayAdapter implements TwoWayAdaptee,TwoWayTarget {

  private TwoWayTarget target;
  private TwoWayAdaptee adaptee;

  public TwoWayAdapter(TwoWayTarget target) {
    this.target = target;
  }

  public TwoWayAdapter(TwoWayAdaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void specificRequest() {
    target.request();
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }
}

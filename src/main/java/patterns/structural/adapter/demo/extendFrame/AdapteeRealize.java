package patterns.structural.adapter.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class AdapteeRealize implements TwoWayAdaptee {
  @Override
  public void specificRequest() {
    System.out.println("适配者代码被调用！");
  }
}

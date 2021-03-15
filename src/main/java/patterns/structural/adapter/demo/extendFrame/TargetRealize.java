package patterns.structural.adapter.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class TargetRealize implements TwoWayTarget {
  @Override
  public void request() {
    System.out.println("目标代码被调用！");
  }
}

package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Dead extends ThreadState {
  public Dead() {
    stateName = "死亡状态";
    System.out.println("当前线程处于：死亡状态");
  }
}

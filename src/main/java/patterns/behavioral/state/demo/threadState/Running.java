package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Running extends ThreadState {
  public Running() {
    stateName = "运行状态";
    System.out.println("当前线程处于：运行状态");
  }

  public void suspend(ThreadContext context){
    System.out.println("调用suspend()方法");
    if ("运行状态".equals(stateName)) {
      context.setState(new Blocked());
    }else{
      System.out.println("当前线程不是处于运行状态，不能调用suspend()方法");
    }
  }

  public void stop(ThreadContext context){
    System.out.println("stop()方法");
    if ("运行状态".equals(stateName)) {
      context.setState(new Dead());
    }else{
      System.out.println("当前线程不是处于运行状态，stop()方法");
    }
  }
}

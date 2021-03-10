package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Blocked extends ThreadState {
  public Blocked() {
    stateName = "阻塞状态";
    System.out.println("当前线程处于：阻塞状态");
  }
  public void resume(ThreadContext  context){
    System.out.print("调用resume()方法-->");
    if ("阻塞状态".equals(stateName)) {
      context.setState(new Runnable());
    }else {
      System.out.println("当前线程不是处于阻塞状态，不能调用resume()方法");
    }
  }
}

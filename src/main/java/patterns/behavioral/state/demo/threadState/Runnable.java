package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class Runnable extends ThreadState {
  public Runnable() {
    stateName = "就绪状态";
    System.out.println("当前线程处于：就绪状态");
  }

  public void getCPU(ThreadContext context){
    System.out.println("调用getCPU()方法");
    if ("就绪状态".equals(stateName)) {
      context.setState(new Running());
    }else{
      System.out.println("线程不是处于就绪状态，不能调用getCPU()方法");
    }
  }
}

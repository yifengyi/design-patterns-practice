package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class New extends ThreadState {
  public New() {
    stateName = "新建状态";
    System.out.println("当前线程处于：新建状态");
  }

  public void start(ThreadContext context){
    System.out.print("调用start()方法-->");
    if ("新建状态".equals(stateName)) {
      context.setState(new Runnable());
    }else{
      System.out.println("当前线程不是处于新建状态，不能调用start()方法");
    }
  }
}

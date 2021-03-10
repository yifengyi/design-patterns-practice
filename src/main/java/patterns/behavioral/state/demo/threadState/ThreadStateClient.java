package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ThreadStateClient {
  public static void main(String[] args) {
    ThreadContext context = new ThreadContext();
    context.start();
    context.getCPU();
    context.suspend();
    context.resume();
    context.getCPU();
    context.stop();
  }
}

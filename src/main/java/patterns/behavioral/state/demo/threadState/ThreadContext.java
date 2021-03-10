package patterns.behavioral.state.demo.threadState;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ThreadContext {
  private ThreadState state;

  public ThreadContext() {
    state = new New();
  }

  public void setState(ThreadState state) {
    this.state = state;
  }

  public ThreadState getState() {
    return state;
  }

  public void start(){
    ((New) this.state).start(this);
  }
  public void getCPU(){
    ((Runnable) this.state).getCPU(this);
  }
  public void suspend(){
    ((Running) this.state).suspend(this);
  }
  public void resume(){
    ((Blocked) this.state).resume(this);
  }
  public void stop(){
    ((Running) this.state).stop(this);
  }
}

package patterns.behavioral.state.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class Context {
  private State state;

  public Context() {
    state = new ConcreteState1();
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void handle(){
    state.handle(this);
  }
}

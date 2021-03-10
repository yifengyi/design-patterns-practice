package patterns.behavioral.state.demo.gradeAppraise;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ScoreContext {
  private AbstractState state;

  public ScoreContext() {
    state = new LowState(this);
  }

  public AbstractState getState() {
    return state;
  }

  public void setState(AbstractState state) {
    this.state = state;
  }

  public void add(int score){
    state.addScore(score);
  }
}

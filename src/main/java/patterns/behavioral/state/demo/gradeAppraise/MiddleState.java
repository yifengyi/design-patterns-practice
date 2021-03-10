package patterns.behavioral.state.demo.gradeAppraise;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class MiddleState  extends AbstractState{
  public MiddleState(AbstractState state) {
    context = state.context;
    stateName = "中等";
    score=state.score;
  }

  @Override
  public void checkState() {
    if (score<=60) {
      context.setState(new LowState(this));
    }else if(score<=90){
      context.setState(new HighState(this));
    }
  }
}

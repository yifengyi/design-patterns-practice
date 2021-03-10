package patterns.behavioral.state.demo.gradeAppraise;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class LowState extends AbstractState {

  public LowState(ScoreContext context) {
    super.context =context;
    stateName = "不及格";
    score = 0;
  }

  public LowState(AbstractState state) {
    context = state.context;
    stateName="不及格";
    score=0;
  }

  @Override
  public void checkState() {
    if (score>=90) {
      context.setState(new HighState(this));
    }else if(score>=60){
      context.setState(new MiddleState(this));
    }
  }
}

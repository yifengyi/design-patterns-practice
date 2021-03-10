package patterns.behavioral.state.demo.gradeAppraise;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public abstract class AbstractState {
  protected ScoreContext context;
  protected String stateName;
  protected int score;

  public abstract void checkState();

  public void addScore(int score){
    this.score += score;
    System.out.print("加上：" + score + "分，\t当前分数：" + this.score);
    checkState();
    System.out.println("分，\t当前状态：" + context.getState().stateName);
  }
}

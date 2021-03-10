package patterns.behavioral.state.demo.gradeAppraise;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ScoreStateClient {
  public static void main(String[] args) {
    ScoreContext account = new ScoreContext();
    System.out.println("学生成绩状态测试：");
    account.add(30);
    account.add(40);
    account.add(25);
    account.add(-15);
    account.add(-25);
  }
}

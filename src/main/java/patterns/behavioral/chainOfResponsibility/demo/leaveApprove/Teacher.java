package patterns.behavioral.chainOfResponsibility.demo.leaveApprove;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Teacher extends Leader {
  @Override
  public void approveLeave(int leaveDays) {
    if (leaveDays <= 3) {
      System.out.println("班主任准假：" + leaveDays + "天");
    }else{
      if (super.next != null) {
        super.next.approveLeave(leaveDays);
      }else {
        System.out.println("请假天数太多，没有人批准该假条！");
      }
    }
  }
}

package patterns.behavioral.chainOfResponsibility.demo.leaveApprove;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Department extends Leader {
  @Override
  public void approveLeave(int leaveDays) {
    if (leaveDays <=5) {
      System.out.println("年级组长准假：" + leaveDays + "天");
    }else{
      if (super.next != null) {
        super.next.approveLeave(leaveDays);
      }else {
        System.out.println("请假天数太多，没有人批准该假条！");
      }
    }
  }
}

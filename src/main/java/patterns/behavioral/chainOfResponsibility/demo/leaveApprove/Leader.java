package patterns.behavioral.chainOfResponsibility.demo.leaveApprove;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public abstract class Leader {
  protected Leader next;

  public void setNext(Leader next) {
    this.next = next;

  }

  public abstract void approveLeave(int leaveDays);
}

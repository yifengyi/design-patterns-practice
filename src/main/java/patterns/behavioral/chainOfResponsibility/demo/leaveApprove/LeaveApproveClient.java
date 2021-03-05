package patterns.behavioral.chainOfResponsibility.demo.leaveApprove;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class LeaveApproveClient {
  public static void main(String[] args) {
    Leader teacher = new Teacher();
    Leader dep = new Department();

    teacher.setNext(dep);

    teacher.approveLeave(5);
  }
}

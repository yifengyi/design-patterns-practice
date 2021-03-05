package patterns.behavioral.chainOfResponsibility.demo.baseFrame;

/**
 * 具体责任环节1
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteHandler1 extends Handler {
  @Override
  public void handler(String req) {
    if ("handler1".equals(req)) {
      System.out.println("ConcreteHandler1处理该请求");
    }else {

      if (super.next != null) {
        super.next.handler(req);
      }else {
        System.out.println("no handler deal");
      }
    }
  }
}

package patterns.behavioral.chainOfResponsibility.demo.baseFrame;

/**
 * 具体责任环节2
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteHandler2 extends Handler {

  @Override
  public void handler(String req) {
    if ("handler2".equals(req)) {
      System.out.println("ConcreteHandler2 处理");
    }else {
      if (super.next != null) {
        super.next.handler(req);
      }else {
        System.out.println("no handler deal");
      }
    }
  }
}

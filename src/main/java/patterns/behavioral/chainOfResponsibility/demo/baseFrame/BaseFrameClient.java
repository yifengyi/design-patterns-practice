package patterns.behavioral.chainOfResponsibility.demo.baseFrame;

/**
 * 责任链模式测试
 * 1.0v created by wujf on 2021-3-5
 */
public class BaseFrameClient {
  public static void main(String[] args) {
    ////组装责任链
    Handler hand1 = new ConcreteHandler1();
    Handler hand2 = new ConcreteHandler2();
    hand1.setNext(hand2);
    //提交请求
    hand1.handler("handler2");
  }
}

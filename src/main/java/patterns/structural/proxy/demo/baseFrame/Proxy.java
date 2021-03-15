package patterns.structural.proxy.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Proxy implements Subject {
  private RealSubject realSubject;



  @Override
  public void request() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    preRequest();
    realSubject.request();
    postRequest();
  }

  private void postRequest() {
    System.out.println("访问真实主题之后的后续处理。");
  }

  private void preRequest() {

    System.out.println("访问真实主题之前的预处理。");
  }
}

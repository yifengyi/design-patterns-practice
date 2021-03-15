package patterns.structural.proxy.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class RealSubject implements Subject {
  @Override
  public void request() {
    System.out.println("访问真实主题方法...");
  }
}

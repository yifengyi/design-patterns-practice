package patterns.structural.proxy.demo.localSpecial;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class SgProxy implements Specialty  {
  private WySpecialty realSubject = new WySpecialty();

  @Override
  public void display() {
    preRequest();
    realSubject.display();
    postRequest();
  }
  public void preRequest() {
    System.out.println("韶关代理婺源特产开始。");
  }

  public void postRequest() {
    System.out.println("韶关代理婺源特产结束。");
  }
}

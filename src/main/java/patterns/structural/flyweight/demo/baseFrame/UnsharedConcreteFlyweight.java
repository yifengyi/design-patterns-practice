package patterns.structural.flyweight.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class UnsharedConcreteFlyweight {
  private String info;

  public UnsharedConcreteFlyweight(String info) {
    this.info = info;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}

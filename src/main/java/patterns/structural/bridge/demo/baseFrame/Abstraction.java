package patterns.structural.bridge.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public abstract class Abstraction {
  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }
  public abstract void operation();
}

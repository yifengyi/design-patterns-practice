package patterns.structural.bridge.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class RefinedAbstraction extends Abstraction {
  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  public void operation() {
    System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
    implementor.operationImpl();
  }
}

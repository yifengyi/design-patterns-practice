package patterns.structural.bridge.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class ConcreteImplementorA implements Implementor {
  @Override
  public void operationImpl() {
    System.out.println("具体实现化(Concrete Implementor)角色被访问");
  }
}

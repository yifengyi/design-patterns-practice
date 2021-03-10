package patterns.behavioral.templateMethod.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteClass extends AbstractClass {
  @Override
  public void abstractMethod1() {
    System.out.println("抽象方法1得实现被调用");
  }

  @Override
  public void abstractMethod2() {
    System.out.println("抽象方法2得实现被调用");
  }
}

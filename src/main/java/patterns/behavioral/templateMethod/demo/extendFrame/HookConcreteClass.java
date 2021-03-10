package patterns.behavioral.templateMethod.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class HookConcreteClass extends HookAbstractClass {
  @Override
  public void abstractMethod1() {
    System.out.println("抽象方法1的实现被调用...");
  }

  @Override
  public void abstractMethod2() {
    System.out.println("抽象方法2的实现被调用...");
  }
  public void HookMethod1() {
    System.out.println("钩子方法1被重写...");
  }
  public boolean HookMethod2() {
    return false;
  }
}

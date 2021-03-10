package patterns.behavioral.templateMethod.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public abstract class HookAbstractClass {


  public void templateMethod(){
    abstractMethod1();

    hookMethod1();
    if (hookMethod2()) {
      specificMethod();
    }

    abstractMethod2();
  }

  public void specificMethod(){
    System.out.println("抽象类中具体方法被调用");
  }

  public void hookMethod1(){

  }
  public boolean hookMethod2(){
    return true;
  }

  public abstract void abstractMethod1();
  public abstract void abstractMethod2();
}

package patterns.behavioral.templateMethod.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public abstract class AbstractClass {

  public void templateMethod(){
    specificMehod();
    abstractMethod1();
    abstractMethod2();
  }

  public void specificMehod(){
    System.out.println("抽象类中具体方法被调用");
  }

  public abstract void abstractMethod1();

  public abstract void abstractMethod2();
}

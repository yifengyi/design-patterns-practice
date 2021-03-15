package patterns.structural.facade.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Facade {
  private SubSystem1 system1 = new SubSystem1();
  private SubSystem2 system2 = new SubSystem2();
  private SubSystem3 system3 = new SubSystem3();

  public void method(){
    system1.method1();
    system2.method2();
    system3.method3();
  }
}

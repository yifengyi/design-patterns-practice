package patterns.behavioral.templateMethod.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class HookClient {
  public static void main(String[] args) {
    HookAbstractClass hc = new HookConcreteClass();
    hc.templateMethod();
  }
}

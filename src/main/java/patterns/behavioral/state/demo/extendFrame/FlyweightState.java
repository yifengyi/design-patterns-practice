package patterns.behavioral.state.demo.extendFrame;

/**
 * 在有些情况下，
 * 可能有多个环境对象需要共享一组状态，
 * 这时需要引入享元模式，将这些具体状态对象放在集合中供程序共享
 * 1.0v created by wujf on 2021-3-10
 */
public class FlyweightState {
  public static void main(String[] args) {
    ShareContext context = new ShareContext();
    context.handle();
    context.handle();
    context.handle();
    context.handle();
  }
}

package patterns.behavioral.state.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteShareState1 extends ShareState {
  @Override
  public void handle(ShareContext context) {
    System.out.println("当前状态是：状态1");
    context.setState(context.getState("2"));
  }
}

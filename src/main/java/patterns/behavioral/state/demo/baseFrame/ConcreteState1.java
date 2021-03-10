package patterns.behavioral.state.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class ConcreteState1 extends State{

  @Override
  public void handle(Context context) {
    System.out.println("当前状态是 A.");
    context.setState(new ConcreteState2());
  }
}

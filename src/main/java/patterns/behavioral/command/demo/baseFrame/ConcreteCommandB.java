package patterns.behavioral.command.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteCommandB implements Command {

  private ReceiverB receiverB;

  public ConcreteCommandB() {
    receiverB = new ReceiverB();
  }

  @Override
  public void execute() {
    receiverB.action();
  }
}

package patterns.behavioral.command.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteCommandA implements Command {

  private ReceiverA receiverA;

  public ConcreteCommandA() {
    receiverA = new ReceiverA();
  }

  @Override
  public void execute() {
    receiverA.action();
  }
}

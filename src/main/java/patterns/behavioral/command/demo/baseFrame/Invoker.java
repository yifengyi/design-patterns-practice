package patterns.behavioral.command.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Invoker {
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call(){
    command.execute();
  }
}

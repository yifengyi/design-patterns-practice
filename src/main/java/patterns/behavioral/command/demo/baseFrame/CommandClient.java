package patterns.behavioral.command.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class CommandClient {

  private static Command config(String type){
    Command command = null;
    if ("A".equals(type)) {
      command = new ConcreteCommandA();
    }else if("B".equals(type)){
      command = new ConcreteCommandB();
    }
    return command;
  }
  public static void main(String[] args) {
    Command command = config("A");
    Invoker invoker = new Invoker(command);
    invoker.call();

  }
}

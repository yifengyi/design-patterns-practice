package patterns.behavioral.command.demo.baseFrame;

/**
 * 命令模式包含以下主要角色。
 *  1.抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 *  2.具体命令类（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 *  3.实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 *  4.调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 * 1.0v created by wujf on 2021-3-5
 */
public interface Command {
  void execute();
}

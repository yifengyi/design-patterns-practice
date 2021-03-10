package patterns.behavioral.mediator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class ConcreteColleague1 extends Colleague {
  @Override
  public void receive() {
    System.out.println("具体同事类1收到请求。");
  }

  @Override
  public void send() {
    System.out.println("具体同事类1发出请求。");
    mediator.relay(this); //请中介者转发
  }
}

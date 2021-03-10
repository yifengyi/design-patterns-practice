package patterns.behavioral.mediator.demo.simplifyFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class SimpleConcreteColleague1 implements SimpleColleague {

  public SimpleConcreteColleague1() {
    SimpleMediator mediator = SimpleMediator.getMediator();

    mediator.register(this);
  }

  @Override
  public void receive() {
    System.out.println("具体同事类1：收到请求。");
  }

  @Override
  public void send() {
    SimpleMediator smd = SimpleMediator.getMediator();
    System.out.println("具体同事类1：发出请求...");
    smd.relay(this); //请中介者转发
  }
}

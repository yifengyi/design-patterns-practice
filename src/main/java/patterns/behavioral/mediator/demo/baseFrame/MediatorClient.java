package patterns.behavioral.mediator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class MediatorClient {
  public static void main(String[] args) {
    Mediator md = new ConcreteMediator();
    Colleague c1, c2;
    c1 = new ConcreteColleague1();
    c2 = new ConcreteColleague2();
    md.register(c1);
    md.register(c2);
    c1.send();
    System.out.println("-------------");
    c2.send();
  }
}

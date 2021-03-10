package patterns.behavioral.mediator.demo.simplifyFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class SimpleMediatorPattern {
  public static void main(String[] args) {
    SimpleColleague c1, c2;
    c1 = new SimpleConcreteColleague1();
    c2 = new SimpleConcreteColleague2();
    c1.send();
    System.out.println("-----------------");
    c2.send();
  }
}

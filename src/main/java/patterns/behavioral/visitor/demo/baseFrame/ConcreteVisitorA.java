package patterns.behavioral.visitor.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteVisitorA implements Visitor {
  @Override
  public void visit(ConcreteElementA element) {
    System.out.println("具体访问者A访问-->" + element.operationA());
  }

  @Override
  public void visit(ConcreteElementB element) {
    System.out.println("具体访问者A访问-->" + element.operationB());
  }
}

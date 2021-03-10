package patterns.behavioral.visitor.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteElementB implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String operationB(){
    return "具体元素B的操作。";
  }
}

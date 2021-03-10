package patterns.behavioral.visitor.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ConcreteElementA implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String operationA(){
    return "具体元素A的操作。";
  }
}

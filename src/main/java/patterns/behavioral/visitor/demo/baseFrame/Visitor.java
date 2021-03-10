package patterns.behavioral.visitor.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public interface Visitor {
  void visit(ConcreteElementA element);

  void visit(ConcreteElementB element);
}

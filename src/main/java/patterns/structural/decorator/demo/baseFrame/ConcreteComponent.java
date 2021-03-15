package patterns.structural.decorator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class ConcreteComponent implements Component {

  public ConcreteComponent() {
    System.out.println("创建具体构件角色");
  }

  @Override
  public void operation() {
    System.out.println("调用具体构件角色的方法operation()");
  }
}

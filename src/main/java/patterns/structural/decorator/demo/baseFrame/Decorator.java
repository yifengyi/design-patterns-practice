package patterns.structural.decorator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Decorator implements Component {
  private Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    component.operation();
  }
}

package patterns.structural.composite.demo.baseFrame.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Composite implements Component {

  private List<Component> children = new ArrayList<>();

  @Override
  public void add(Component c) {
    children.add(c);
  }

  @Override
  public void remove(Component c) {
    children.remove(c);
  }

  @Override
  public Component getChild(int i) {
    return children.get(i);
  }

  @Override
  public void operation() {
    for (Component child : children) {
      child.operation();
    }
  }
}

package patterns.structural.composite.demo.baseFrame.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Composite implements Component {
  private List<Component> children = new ArrayList<>();

  public void add(Component c) {
    children.add(c);
  }

  public void remove(Component c) {
    children.remove(c);
  }

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

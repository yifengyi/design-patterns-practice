package patterns.structural.composite.demo.baseFrame.transparent;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public interface Component {
  void add(Component c) ;

  void remove(Component c);

  Component getChild(int i);

  void operation();
}

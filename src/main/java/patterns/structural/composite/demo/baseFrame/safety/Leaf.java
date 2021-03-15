package patterns.structural.composite.demo.baseFrame.safety;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Leaf implements Component {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println("树叶" + name + "：被访问！");
  }
}

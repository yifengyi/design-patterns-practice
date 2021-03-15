package patterns.structural.decorator.demo.devil;

/**
 * //抽象装饰角色：变形
 * 1.0v created by wujf on 2021-3-15
 */
public class Changer  implements Morrigan {
  protected Morrigan m;

  public Changer(Morrigan m) {
    this.m = m;
  }

  @Override
  public void display() {
    m.display();
  }
}

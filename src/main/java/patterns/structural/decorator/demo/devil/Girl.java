package patterns.structural.decorator.demo.devil;

/**
 * //具体装饰角色：少女
 * 1.0v created by wujf on 2021-3-15
 */
public class Girl extends Changer {
  public Girl(Morrigan m) {
    super(m);
  }
  public void setChanger() {
    ((Original) super.m).setT("Morrigan2.jpg");
  }
  @Override
  public void display() {
    setChanger();
    super.display();
  }
}

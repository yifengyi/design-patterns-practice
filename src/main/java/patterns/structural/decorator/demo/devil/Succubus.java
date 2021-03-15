package patterns.structural.decorator.demo.devil;

/**
 * //具体装饰角色：女妖
 * 1.0v created by wujf on 2021-3-15
 */
public class Succubus extends Changer {
  public Succubus(Morrigan m) {
    super(m);
  }

  public void setChanger() {
    ((Original) super.m).setT("Morrigan1.jpg");
  }
  @Override
  public void display() {
    setChanger();
    super.display();
  }
}

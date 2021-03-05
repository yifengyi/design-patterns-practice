package patterns.behavioral.command.demo.restaurant;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class HeFen implements Breakfast {
  private HeFenChef receiver;

  public HeFen() {
    receiver = new HeFenChef();
  }

  @Override
  public void cooking() {
    receiver.cooking();
  }
}

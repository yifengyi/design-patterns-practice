package patterns.behavioral.command.demo.restaurant;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class HunTun implements Breakfast {
  private HunTunChef receiver;

  public HunTun() {
    receiver = new HunTunChef();
  }

  @Override
  public void cooking() {
    receiver.cooking();
  }
}

package patterns.behavioral.command.demo.restaurant;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ChangFen implements Breakfast {
  private ChangFenChef receiver;


  public ChangFen() {
    receiver = new ChangFenChef();
  }

  @Override
  public void cooking() {
    receiver.cooking();
  }
}

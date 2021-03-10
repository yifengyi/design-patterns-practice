package patterns.behavioral.mediator.demo.biancheng;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class Seller extends Customer {

  public Seller( String name) {
    super(name);
    clientWindow(50, 100);
  }

  @Override
  public void send(String ad) {
    receiveArea.append("我(卖方)说: " + ad + "\n");
    //使滚动条滚动到最底端
    receiveArea.setCaretPosition(receiveArea.getText().length());
    medium.relay(name, ad);
  }

  @Override
  public void receive(String from, String ad) {
    receiveArea.append(from + "说: " + ad + "\n");
    //使滚动条滚动到最底端
    receiveArea.setCaretPosition(receiveArea.getText().length());
  }
}

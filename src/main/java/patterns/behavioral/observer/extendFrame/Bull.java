package patterns.behavioral.observer.extendFrame;

import java.util.Observable;
import java.util.Observer;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class Bull implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    double price = (Double) arg;
    if (price > 0) {
      System.out.println("油价上涨" + price + "元，多方高兴了！");
    } else {
      System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
    }
  }
}

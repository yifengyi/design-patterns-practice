package patterns.behavioral.observer.extendFrame;

import java.util.Observable;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class OilFutures extends Observable {
  private double price;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    super.setChanged();  //设置内部标志位，注明数据发生变化
    super.notifyObservers(price);    //通知观察者价格改变了
    this.price = price;
  }
}

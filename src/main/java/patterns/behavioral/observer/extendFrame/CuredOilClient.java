package patterns.behavioral.observer.extendFrame;

import java.util.Observer;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class CuredOilClient {
  public static void main(String[] args) {
    OilFutures oil = new OilFutures();
    Observer bull = new Bull(); //多方
    Observer bear = new Bear(); //空方
    oil.addObserver(bull);
    oil.addObserver(bear);
    oil.setPrice(10);
    oil.setPrice(-8);
  }
}

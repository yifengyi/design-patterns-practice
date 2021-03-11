package patterns.creational.singleton.demo.presidentLazy;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class LazyTest {
  public static void main(String[] args) {
    President president = President.getInstance();
    president.getInfo();
    President president1 = President.getInstance();
    president1.getInfo();
  }
}

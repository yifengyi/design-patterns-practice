package patterns.creational.singleton.demo.presidentLazy;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class President {
  private static volatile President president = null;

  private President() {
  }

  public static synchronized President getInstance(){
    if (president == null) {
      president = new President();
    }else {
      System.out.println("已经有一个总统，不能产生新总统！");
    }
    return president;
  }

  public void getInfo(){
    System.out.println("我是总统");
  }
}

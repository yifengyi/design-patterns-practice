package patterns.creational.singleton.demo.baseFrame;

/**
 * 饿汉式单例
 * 1.0v created by wujf on 2021-3-11
 */
public class HungrySingleton {
  private static final HungrySingleton singleton = new HungrySingleton();

  private HungrySingleton() {
  }
  public HungrySingleton getInstance(){
    return singleton;
  }
}

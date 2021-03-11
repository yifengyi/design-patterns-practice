package patterns.creational.singleton.demo.baseFrame;

/**
 * 懒汉式单例
 * 1.0v created by wujf on 2021-3-11
 */
public class LazySingleton {
  private static volatile LazySingleton singleton = null;//保证 instance 在所有线程中同步

  //private 避免类在外部被实例化
  private LazySingleton() {
  }

  //getInstance 方法前加同步
  public static synchronized LazySingleton getInstance(){
    if (singleton == null) {
      singleton = new LazySingleton();
    }
    return singleton;
  }
}

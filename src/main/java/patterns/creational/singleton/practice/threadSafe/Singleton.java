package patterns.creational.singleton.practice.threadSafe;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public final class Singleton {
  private static volatile Singleton instance;
  public String value;

  private Singleton(String value) {
    this.value = value;
  }

  public static Singleton getInstance(String  value){
    Singleton res = instance;
    if (res != null) {
      return res;
    }
    synchronized (Singleton.class){
      if (instance == null) {
        instance = new Singleton(value);
      }
      return instance;
    }
  }
}

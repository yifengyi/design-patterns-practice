package patterns.creational.singleton.practice.multiThread;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public final class Singleton {
  private static Singleton instance;
  public String value;

  private Singleton(String value) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.value = value;
  }
  public static Singleton getInstance(String value){
    if (instance == null) {
      instance = new Singleton(value);
    }
    return instance;
  }
}

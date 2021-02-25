package patterns.creational.singleton.practice.nonThread;

/**
 * // 单例会对`getInstance（获取实例）`方法进行定义以让客户端在程序各处
 * // 都能访问相同的实例。
 * 1.0v created by wujf on 2021-1-29
 */
public final class Singleton {
  // 保存单例实例的成员变量必须被声明为静态类型。
  private static Singleton instance;
  public String value;

  // 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构
  // 造方法。
  private Singleton(String value) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.value = value;
  }
  // 用于控制对单例实例的访问权限的静态方法。
  public static Singleton getInstance(String value){
    if (instance == null) {
      instance = new Singleton(value);
    }
    return instance;
  }
}

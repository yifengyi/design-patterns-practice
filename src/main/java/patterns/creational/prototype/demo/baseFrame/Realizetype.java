package patterns.creational.prototype.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Realizetype implements Cloneable {
  Realizetype() {
    System.out.println("具体原型创建成功！");
  }
  public Object clone() throws CloneNotSupportedException {
    System.out.println("具体原型复制成功！");
    return (Realizetype) super.clone();
  }
}

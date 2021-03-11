package patterns.creational.prototype.demo.extendFrame;

/**
 * 原型模式可扩展为带原型管理器的原型模式，它在原型模式的基础上增加了一个原型管理器 PrototypeManager 类。该类用 HashMap
 * 保存多个复制的原型，Client 类可以通过管理器的 get(String id) 方法从中获取复制的原型。
 * 1.0v created by wujf on 2021-3-11
 */
public class ManagerClient {
  public static void main(String[] args) {
    PrototypeManager pm = new PrototypeManager();
    Shape obj1 = (Circle) pm.getShape("Circle");
    obj1.countArea();
    Shape obj2 = (Shape) pm.getShape("Square");
    obj2.countArea();
  }
}

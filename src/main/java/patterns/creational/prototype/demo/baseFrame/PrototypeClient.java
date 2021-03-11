package patterns.creational.prototype.demo.baseFrame;

/**
 * 原型模式包含以下主要角色。
 *  1.抽象原型类：规定了具体原型对象必须实现的接口。
 *  2.具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 *  3.访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * 原型模式的克隆分为浅克隆和深克隆。
 *  1.浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 *  2.深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 * Java 中的 Object 类提供了浅克隆的 clone() 方法，
 * 具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，
 * 这里的 Cloneable 接口就是抽象原型类。
 * 1.0v created by wujf on 2021-3-11
 */
public class PrototypeClient {
  public static void main(String[] args) throws CloneNotSupportedException {
    Realizetype obj1 = new Realizetype();
    Realizetype obj2 = (Realizetype) obj1.clone();
    System.out.println("obj1==obj2?" + (obj1 == obj2));
  }
}

package patterns.structural.composite.demo.baseFrame.transparent;

/**
 * 组合模式包含以下主要角色。
 *  1.抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）
 *  2.树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 *  3.树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 * 透明方式
 *    在该方式中，由于抽象构件声明了所有子类中的全部方法，所以客户端无须区别树叶对象和树枝对象，对客户端来说是透明的。但其缺点是：树叶构件本来没有 Add()、Remove()
 *    及 GetChild() 方法，却要实现它们（空实现或抛异常），这样会带来一些安全性问题。
 * 1.0v created by wujf on 2021-3-15
 */
public class TransparentClient {
  public static void main(String[] args) {
    Component c0 = new Composite();
    Component c1 = new Composite();
    Component leaf1 = new Leaf("1");
    Component leaf2 = new Leaf("2");
    Component leaf3 = new Leaf("3");
    c0.add(leaf1);
    c0.add(c1);
    c1.add(leaf2);
    c1.add(leaf3);
    c0.operation();
  }
}

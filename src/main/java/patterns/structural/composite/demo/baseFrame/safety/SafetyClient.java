package patterns.structural.composite.demo.baseFrame.safety;

/**
 * 组合模式包含以下主要角色。
 *  1.抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）
 *  2.树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 *  3.树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 *安全方式
 *  在该方式中，将管理子构件的方法移到树枝构件中，抽象构件和树叶构件没有对子对象的管理方法，
 *  这样就避免了上一种方式的安全性问题，但由于叶子和分支有不同的接口，客户端在调用时要知道树叶对象和树枝对象的存在，所以失去了透明性。
 * 1.0v created by wujf on 2021-3-15
 */
public class SafetyClient {
  public static void main(String[] args) {
    Composite c0 = new Composite();
    Composite c1 = new Composite();
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

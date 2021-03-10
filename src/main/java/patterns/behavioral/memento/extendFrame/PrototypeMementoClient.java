package patterns.behavioral.memento.extendFrame;

/**
 * 备忘录模式如何同原型模式混合使用。在备忘录模式中，通过定义“备忘录”来备份“发起人”的信息，而原型模式的 clone()
 * 方法具有自备份功能，所以，如果让发起人实现 Cloneable 接口就有备份自己的功能，这时可以删除备忘录类
 * 1.0v created by wujf on 2021-3-9
 */
public class PrototypeMementoClient {
  public static void main(String[] args) {
    OriginatorPrototype or = new OriginatorPrototype();
    PrototypeCaretaker cr = new PrototypeCaretaker();
    or.setState("S0");
    System.out.println("初始状态:" + or.getState());
    cr.setMemento(or.getMemento()); //保存状态
    or.setState("S1");
    System.out.println("新的状态:" + or.getState());
    or.resetMemento(cr.getMemento()); //恢复状态
    System.out.println("恢复状态:" + or.getState());
  }
}

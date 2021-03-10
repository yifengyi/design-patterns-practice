package patterns.behavioral.memento.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class MementoClient {
  public static void main(String[] args) {
    Originator or = new Originator();
    Caretaker cr = new Caretaker();

    or.setState("SO");
    System.out.println("初始状态:" + or.getState());
    cr.setMemento(or.createMemento()); //保存状态
    or.setState("S1");
    System.out.println("新的状态:" + or.getState());
    or.restoreMemento(cr.getMemento()); //恢复状态
    System.out.println("恢复状态:" + or.getState());
  }
}

package patterns.behavioral.memento.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class Caretaker {
  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}

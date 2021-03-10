package patterns.behavioral.memento.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class PrototypeCaretaker {
  private OriginatorPrototype memento;

  public OriginatorPrototype getMemento() {
    return memento;
  }

  public void setMemento(OriginatorPrototype memento) {
    this.memento = memento;
  }
}

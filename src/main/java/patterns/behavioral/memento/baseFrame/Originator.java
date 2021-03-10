package patterns.behavioral.memento.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class Originator {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento createMemento(){
    return new Memento(state);
  }
  public void restoreMemento(Memento m){
    this.setState(m.getState());
  }
}

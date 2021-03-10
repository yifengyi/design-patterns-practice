package patterns.behavioral.memento.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class OriginatorPrototype implements Cloneable {

  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public OriginatorPrototype getMemento(){
    return this.clone();
  }

  public void resetMemento(OriginatorPrototype o){
    this.setState(o.getState());

  }

  @Override
  public OriginatorPrototype clone() {

    try {
      return (OriginatorPrototype) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
}

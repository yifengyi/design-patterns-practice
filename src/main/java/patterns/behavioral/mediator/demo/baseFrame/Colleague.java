package patterns.behavioral.mediator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public abstract class Colleague {
  protected Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receive();

  public abstract void send();
}

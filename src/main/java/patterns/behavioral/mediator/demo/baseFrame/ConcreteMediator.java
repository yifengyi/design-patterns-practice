package patterns.behavioral.mediator.demo.baseFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class ConcreteMediator extends Mediator {

  private List<Colleague> colleagues = new ArrayList<>();

  @Override
  public void register(Colleague colleague) {
    if (!colleagues.contains(colleague)) {
      colleagues.add(colleague);
      //
      colleague.setMediator(this);
    }
  }

  @Override
  public void relay(Colleague colleague) {
    for (Colleague c : colleagues) {
      if (!c.equals(colleague)) {
        c.receive();
      }
    }
  }
}

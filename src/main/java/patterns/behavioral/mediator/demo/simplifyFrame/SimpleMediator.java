package patterns.behavioral.mediator.demo.simplifyFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class SimpleMediator {
  private static SimpleMediator mediator = new SimpleMediator();

  private List<SimpleColleague> colleagues = new ArrayList<>();


  private SimpleMediator(){}

  public static SimpleMediator getMediator(){
    return mediator;
  }

  public void register(SimpleColleague colleague){
    if (!colleagues.contains(colleague)) {
      colleagues.add(colleague);
    }
  }

  public void relay(SimpleColleague colleague){
    for (SimpleColleague simpleColleague : colleagues) {
      if (!simpleColleague.equals(colleague)) {
        simpleColleague.receive();
      }
    }
  }
}

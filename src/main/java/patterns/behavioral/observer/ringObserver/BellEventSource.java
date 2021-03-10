package patterns.behavioral.observer.ringObserver;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class BellEventSource  {
  private List<BellEventListener> listeners = new ArrayList<>();

  public void add(BellEventListener listener){
    listeners.add(listener);
  }
  public void remove(BellEventListener listener){
    listeners.remove(listener);
  }

  public void ring(boolean sound){

    String type = sound ? "上课铃" : "下课铃";
    System.out.println(type + "响！");

    RingEvent event = new RingEvent(this,sound);
    notifies(event);
  }
  protected void notifies(RingEvent event){
    for (BellEventListener listener : listeners) {
      listener.heardBell(event);
    }
  }


}

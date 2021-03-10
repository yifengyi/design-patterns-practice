package patterns.behavioral.observer.ringObserver;

import java.util.EventObject;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class RingEvent extends EventObject {
  private boolean sound;
  public RingEvent(Object source,boolean sound) {
    super(source);
    this.sound = sound;
  }

  public boolean isSound() {
    return sound;
  }

  public void setSound(boolean sound) {
    this.sound = sound;
  }
}

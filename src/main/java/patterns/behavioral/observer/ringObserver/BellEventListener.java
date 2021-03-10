package patterns.behavioral.observer.ringObserver;

import java.util.EventListener;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public interface BellEventListener extends EventListener {
  void heardBell(RingEvent event);
}

package patterns.behavioral.observer.practice.listeners;

import java.io.File;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public interface EventListener {
  void update(String eventType, File file);
}

package patterns.behavioral.observer.practice.listeners;

import java.io.File;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class LogOpenListener implements EventListener {
  private File log;

  public LogOpenListener(String fileName) {
    this.log = new File(fileName);
  }

  @Override
  public void update(String eventType, File file) {
    System.out.println("Save to log " + log
            + ": Someone has performed " + eventType
            + " operation with the following file: " + file.getName());

  }
}

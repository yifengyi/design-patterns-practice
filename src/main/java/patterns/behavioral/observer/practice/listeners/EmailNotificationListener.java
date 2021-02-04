package patterns.behavioral.observer.practice.listeners;

import java.io.File;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class EmailNotificationListener implements EventListener {
  private String email;

  public EmailNotificationListener(String email) {
    this.email = email;
  }

  @Override
  public void update(String eventType, File file) {
    System.out.println("Email to " + email
            + ": Someone has performed " + eventType
            + " operation with the following file: " + file.getName());
  }
}

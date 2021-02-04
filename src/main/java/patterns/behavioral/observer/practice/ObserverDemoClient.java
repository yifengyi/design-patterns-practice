package patterns.behavioral.observer.practice;

import patterns.behavioral.observer.practice.editor.Editor;
import patterns.behavioral.observer.practice.listeners.EmailNotificationListener;
import patterns.behavioral.observer.practice.listeners.LogOpenListener;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class ObserverDemoClient {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.events.subscribe("open", new LogOpenListener("file.txt"));
    editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

    try {
      editor.openFile("test.txt");
      editor.saveFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

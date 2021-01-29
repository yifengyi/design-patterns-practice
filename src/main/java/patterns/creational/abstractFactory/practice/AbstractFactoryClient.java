package patterns.creational.abstractFactory.practice;

import patterns.creational.abstractFactory.practice.app.Application;
import patterns.creational.abstractFactory.practice.factories.GUIFactory;
import patterns.creational.abstractFactory.practice.factories.MacOSFactory;
import patterns.creational.abstractFactory.practice.factories.WindowsFactory;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class AbstractFactoryClient {
  private static Application configApplication() {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();

    if (osName.contains("mac")) {
      factory = new MacOSFactory();
      app = new Application(factory);
    } else {
      factory = new WindowsFactory();
      app = new Application(factory);
    }
    return app;
  }


  public static void main(String[] args) {
    Application app = configApplication();
    app.paint();
  }
}

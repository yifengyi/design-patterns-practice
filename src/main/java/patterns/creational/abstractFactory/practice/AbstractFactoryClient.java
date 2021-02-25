package patterns.creational.abstractFactory.practice;

import patterns.creational.abstractFactory.practice.app.Application;
import patterns.creational.abstractFactory.practice.factories.GUIFactory;
import patterns.creational.abstractFactory.practice.factories.MacOSFactory;
import patterns.creational.abstractFactory.practice.factories.WindowsFactory;

/**
 * // 客户端代码仅通过抽象类型（GUIFactory、Button 和 Checkbox）使用工厂
 * // 和产品。这让你无需修改任何工厂或产品子类就能将其传递给客户端代码。
 * 1.0v created by wujf on 2021-1-29
 */
public class AbstractFactoryClient {

  // 程序会根据当前配置或环境设定选择工厂类型，并在运行时创建工厂（通常在初
// 始化阶段）。
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

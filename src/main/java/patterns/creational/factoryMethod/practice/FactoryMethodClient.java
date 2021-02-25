package patterns.creational.factoryMethod.practice;

import patterns.creational.factoryMethod.practice.factory.Dialog;
import patterns.creational.factoryMethod.practice.factory.HtmlDialog;
import patterns.creational.factoryMethod.practice.factory.WindowsDialog;

/**
 * 1.0v created by wujf on 2021-1-29
 * 客户端代码
 */
public class FactoryMethodClient {
  private static Dialog dialog;

  // 程序根据当前配置或环境设定选择创建者的类型。
  static void configure(){
    if ("Windows 10".equals(System.getProperty("os.name"))) {
      dialog = new WindowsDialog();
    }else{
      dialog = new HtmlDialog();
    }
  }
  static void runBusinessLogic(){
    dialog.renderWindow();
  }
  // 当前客户端代码会与具体创建者的实例进行交互，但是必须通过其基本接口
  // 进行。只要客户端通过基本接口与创建者进行交互，你就可将任何创建者子
  // 类传递给客户端。
  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }
}

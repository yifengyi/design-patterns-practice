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
  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }
}

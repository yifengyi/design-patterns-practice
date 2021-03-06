package patterns.creational.factoryMethod.practice.factory;

import patterns.creational.factoryMethod.practice.buttons.Button;
import patterns.creational.factoryMethod.practice.buttons.WindowsButton;

/**
 * // 具体创建者将重写工厂方法以改变其所返回的产品类型。
 * 1.0v created by wujf on 2021-1-29
 * 具体创建者：win10按钮创建者
 */
public class WindowsDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}

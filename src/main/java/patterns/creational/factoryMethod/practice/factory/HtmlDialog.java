package patterns.creational.factoryMethod.practice.factory;

import patterns.creational.factoryMethod.practice.buttons.Button;
import patterns.creational.factoryMethod.practice.buttons.HtmlButton;

/**
 * 1.0v created by wujf on 2021-1-29
 * 具体创建者：html按钮创建
 */
public class HtmlDialog extends Dialog {
  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}

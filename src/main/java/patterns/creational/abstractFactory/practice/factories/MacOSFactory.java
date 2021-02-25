package patterns.creational.abstractFactory.practice.factories;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.buttions.MacOSButton;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;
import patterns.creational.abstractFactory.practice.checkboxes.MacOSCheckbox;

/**
 * // 具体工厂可生成属于同一变体的系列产品。工厂会确保其创建的产品能相互搭配
 * // 使用。具体工厂方法签名会返回一个抽象产品，但在方法内部则会对具体产品进
 * // 行实例化。
 * 1.0v created by wujf on 2021-1-29
 */
public class MacOSFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}

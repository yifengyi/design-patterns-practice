package patterns.creational.abstractFactory.practice.factories;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;

/**
 * // 抽象工厂接口声明了一组能返回不同抽象产品的方法。这些产品属于同一个系列
 * // 且在高层主题或概念上具有相关性。同系列的产品通常能相互搭配使用。系列产
 * // 品可有多个变体，但不同变体的产品不能搭配使用。
 * 1.0v created by wujf on 2021-1-29
 */
public interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}

package patterns.creational.factoryMethod.practice.factory;

import patterns.creational.factoryMethod.practice.buttons.Button;

/**
 * // 创建者类声明的工厂方法必须返回一个产品类的对象。创建者的子类通常会提供
 * // 该方法的实现。
 * 1.0v created by wujf on 2021-1-29
 * 基础创建者
 */
public abstract class Dialog {
  // 请注意，创建者的主要职责并非是创建产品。其中通常会包含一些核心业务
  // 逻辑，这些逻辑依赖于由工厂方法返回的产品对象。子类可通过重写工厂方
  // 法并使其返回不同类型的产品来间接修改业务逻辑。
  public void renderWindow(){
    Button okButton = createButton();
    okButton.render();
  }
  // 创建者还可提供一些工厂方法的默认实现。
  public abstract Button createButton();
}

package patterns.creational.factoryMethod.practice.factory;

import patterns.creational.factoryMethod.practice.buttons.Button;

/**
 * 1.0v created by wujf on 2021-1-29
 * 基础创建者
 */
public abstract class Dialog {
  public void renderWindow(){
    Button okButton = createButton();
    okButton.render();
  }
  public abstract Button createButton();
}

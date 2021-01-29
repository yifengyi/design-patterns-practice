package patterns.creational.abstractFactory.practice.factories;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.buttions.MacOSButton;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;
import patterns.creational.abstractFactory.practice.checkboxes.MacOSCheckbox;

/**
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

package patterns.creational.abstractFactory.practice.factories;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.buttions.WindowsButton;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;
import patterns.creational.abstractFactory.practice.checkboxes.WindowsCheckbox;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class WindowsFactory implements GUIFactory{
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}

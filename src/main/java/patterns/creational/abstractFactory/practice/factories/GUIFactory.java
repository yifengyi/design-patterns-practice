package patterns.creational.abstractFactory.practice.factories;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}

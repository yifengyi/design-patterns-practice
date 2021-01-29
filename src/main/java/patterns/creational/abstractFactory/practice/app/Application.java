package patterns.creational.abstractFactory.practice.app;

import patterns.creational.abstractFactory.practice.buttions.Button;
import patterns.creational.abstractFactory.practice.checkboxes.Checkbox;
import patterns.creational.abstractFactory.practice.factories.GUIFactory;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class Application {
  private Button button;
  private Checkbox checkbox;

  public Application(GUIFactory factory){
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }
  public void paint(){
    button.paint();
    checkbox.paint();
  }
}

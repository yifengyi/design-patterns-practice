package patterns.creational.abstractFactory.practice.checkboxes;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class WindowsCheckbox implements Checkbox {
  @Override
  public void paint() {
    System.out.println("You have created WindowsCheckbox.");
  }
}

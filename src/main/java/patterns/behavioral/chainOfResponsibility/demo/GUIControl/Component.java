package patterns.behavioral.chainOfResponsibility.demo.GUIControl;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public abstract class Component implements ComponentWithContextualHelp{
  protected Container container;
  protected String tooltipText;

  public Component() {
  }


  @Override
  public void showHelp() {
    if (Objects.nonNull(tooltipText)) {
      System.out.println(tooltipText);
    }else{
      container.showHelp();
    }
  }
}

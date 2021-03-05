package patterns.behavioral.chainOfResponsibility.demo.GUIControl;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Panel extends Container {
  private String modelHelpText;

  public Panel(String title) {
    super.tooltipText =title;
  }

  public void setModelHelpText(String modelHelpText) {
    this.modelHelpText = modelHelpText;
  }

  @Override
  public void showHelp() {
    if (Objects.nonNull(modelHelpText)) {
      System.out.println(modelHelpText);
    }else{
      super.showHelp();
    }
  }
}

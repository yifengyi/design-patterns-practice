package patterns.behavioral.mediator.practice.components;

import patterns.behavioral.mediator.practice.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class SaveButton extends JButton implements Component {
  private Mediator mediator;

  public SaveButton() {
    super("Save");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void fireActionPerformed(ActionEvent actionEvent) {
    mediator.saveChanges();
  }

  @Override
  public String getName() {
    return "SaveButton";
  }
}

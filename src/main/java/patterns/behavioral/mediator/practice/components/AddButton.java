package patterns.behavioral.mediator.practice.components;

import patterns.behavioral.mediator.practice.mediator.Mediator;
import patterns.behavioral.mediator.practice.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class AddButton extends JButton implements Component {
  private Mediator mediator;

  public AddButton() {
    super("Add");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void fireActionPerformed(ActionEvent event) {
    mediator.addNewNote(new Note());
  }

  @Override
  public String getName() {
    return "AddButton";
  }
}

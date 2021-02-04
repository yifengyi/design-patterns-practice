package patterns.behavioral.mediator.practice.components;

import patterns.behavioral.mediator.practice.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class TextBox extends JTextArea implements Component {
  private Mediator mediator;

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void processComponentKeyEvent(KeyEvent keyEvent) {
    mediator.markNote();
  }

  @Override
  public String getName() {
    return "TextBox";
  }
}

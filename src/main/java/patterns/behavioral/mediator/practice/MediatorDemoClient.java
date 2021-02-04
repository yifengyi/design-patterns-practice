package patterns.behavioral.mediator.practice;

import patterns.behavioral.mediator.practice.components.*;
import patterns.behavioral.mediator.practice.mediator.Editor;
import patterns.behavioral.mediator.practice.mediator.Mediator;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class MediatorDemoClient {
  public static void main(String[] args) {
    Mediator mediator = new Editor();

    mediator.registerComponent(new Title());
    mediator.registerComponent(new TextBox());
    mediator.registerComponent(new AddButton());
    mediator.registerComponent(new DeleteButton());
    mediator.registerComponent(new SaveButton());
    mediator.registerComponent(new List(new DefaultListModel()));
    mediator.registerComponent(new Filter());

    mediator.createGUI();
  }
}

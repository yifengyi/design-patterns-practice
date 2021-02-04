package patterns.behavioral.command.practice.commands;

import patterns.behavioral.command.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public abstract class Command {
  public Editor editor;
  private String backup;

  Command(Editor editor) {
    this.editor = editor;
  }
  void backup() {
    backup = editor.textField.getText();
  }

  public void undo() {
    editor.textField.setText(backup);
  }

  public abstract boolean execute();
}

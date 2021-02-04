package patterns.behavioral.command.practice.commands;

import patterns.behavioral.command.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class CopyCommand  extends Command{
  public CopyCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    editor.clipboard = editor.textField.getSelectedText();
    return false;
  }
}

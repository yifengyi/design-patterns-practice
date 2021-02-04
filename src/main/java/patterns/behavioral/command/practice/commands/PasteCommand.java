package patterns.behavioral.command.practice.commands;

import patterns.behavioral.command.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class PasteCommand extends Command {

  public PasteCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    if (editor.clipboard == null
            || editor.clipboard.isEmpty()) {
      return false;
    }
    backup();
    editor.textField.insert(editor.clipboard,editor.textField.getCaretPosition());
    return true;
  }
}

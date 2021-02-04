package patterns.behavioral.command.practice.commands;

import patterns.behavioral.command.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class CutCommand extends Command {
  public CutCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    if (editor.textField.getSelectedText().isEmpty()) {
      return false;
    }
    backup();
    String source = editor.textField.getText();
    editor.clipboard = editor.textField.getSelectedText();
    editor.textField.setText(cutString(source));
    return true;
  }

  private String cutString(String source){
    String start = source.substring(0, editor.textField.getSelectionStart());
    String end = source.substring(editor.textField.getSelectionEnd());
    return start+end;
  }
}

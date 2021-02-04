package patterns.behavioral.memento.practice.history;

import patterns.behavioral.memento.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Memento {
  private String backup;
  private Editor editor;

  public Memento(Editor editor) {
    this.editor = editor;
    this.backup = editor.backup();
  }

  public void restore() {
    editor.restore(backup);
  }
}

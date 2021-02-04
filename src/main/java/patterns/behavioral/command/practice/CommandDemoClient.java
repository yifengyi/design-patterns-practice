package patterns.behavioral.command.practice;

import patterns.behavioral.command.practice.editor.Editor;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class CommandDemoClient {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.init();
  }
}

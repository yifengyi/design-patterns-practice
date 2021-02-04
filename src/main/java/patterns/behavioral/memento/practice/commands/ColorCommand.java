package patterns.behavioral.memento.practice.commands;

import patterns.behavioral.memento.practice.editor.Editor;
import patterns.behavioral.memento.practice.shapes.Shape;

import java.awt.*;


/**
 * 1.0v created by wujf on 2021-2-3
 */
public class ColorCommand implements Command {
  private Editor editor;
  private Color  color;

  public ColorCommand(Editor editor, Color color) {
    this.editor = editor;
    this.color = color;
  }

  @Override
  public String getName() {
    return "Colorize: " + color.toString();
  }

  @Override
  public void execute() {
    for (Shape child : editor.getShapes().getSelected()) {
      child.setColor(color);
    }
  }
}

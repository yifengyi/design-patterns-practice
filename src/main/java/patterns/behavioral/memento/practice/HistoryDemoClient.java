package patterns.behavioral.memento.practice;

import patterns.behavioral.memento.practice.editor.Editor;
import patterns.behavioral.memento.practice.shapes.Circle;
import patterns.behavioral.memento.practice.shapes.CompoundShape;
import patterns.behavioral.memento.practice.shapes.Dot;
import patterns.behavioral.memento.practice.shapes.Rectangle;

import java.awt.*;


/**
 * 1.0v created by wujf on 2021-2-3
 */
public class HistoryDemoClient {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.loadShapes(
            new Circle(10, 10, 10, Color.BLUE),

            new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
            ),

            new CompoundShape(
                    new Rectangle(250, 250, 100, 100, Color.GREEN),
                    new Dot(240, 240, Color.GREEN),
                    new Dot(240, 360, Color.GREEN),
                    new Dot(360, 360, Color.GREEN),
                    new Dot(360, 240, Color.GREEN)
            )
    );
  }
}

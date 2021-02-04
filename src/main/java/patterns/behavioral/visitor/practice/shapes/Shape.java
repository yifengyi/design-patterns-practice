package patterns.behavioral.visitor.practice.shapes;

import patterns.behavioral.visitor.practice.visitor.Visitor;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public interface Shape {
  void move(int x, int y);
  void draw();

  String accept(Visitor visitor);
}

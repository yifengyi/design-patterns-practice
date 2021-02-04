package patterns.behavioral.visitor.practice.visitor;

import patterns.behavioral.visitor.practice.shapes.*;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public interface Visitor {
  String visitDot(Dot dot);

  String visitCircle(Circle circle);

  String visitRectangle(Rectangle rectangle);

  String visitCompoundGraphic(CompoundShape cg);

  String export(Shape... args);
}

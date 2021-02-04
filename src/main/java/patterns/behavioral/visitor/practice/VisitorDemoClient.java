package patterns.behavioral.visitor.practice;

import patterns.behavioral.visitor.practice.shapes.*;
import patterns.behavioral.visitor.practice.visitor.Visitor;
import patterns.behavioral.visitor.practice.visitor.XMLExportVisitor;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class VisitorDemoClient {
  public static void main(String[] args) {
    Dot dot = new Dot(1, 10, 55);
    Circle circle = new Circle(2, 23, 15, 10);
    Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

    CompoundShape compoundShape = new CompoundShape(4);
    compoundShape.add(dot);
    compoundShape.add(circle);
    compoundShape.add(rectangle);

    CompoundShape c = new CompoundShape(5);
    c.add(dot);
    compoundShape.add(c);

    export(circle, compoundShape);
  }

  private static void export(Shape... shapes) {
    Visitor exportVisitor = new XMLExportVisitor();
    System.out.println(exportVisitor.export(shapes));
  }
}

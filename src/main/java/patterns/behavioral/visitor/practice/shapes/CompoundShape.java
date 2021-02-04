package patterns.behavioral.visitor.practice.shapes;

import patterns.behavioral.visitor.practice.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class CompoundShape implements Shape {
  public int         id;
  public List<Shape> children = new ArrayList<>();

  public CompoundShape(int id) {
    this.id = id;
  }

  @Override
  public void move(int x, int y) {
    // move shape
  }

  @Override
  public void draw() {
    // draw shape
  }

  public int getId() {
    return id;
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitCompoundGraphic(this);
  }

  public void add(Shape shape) {
    children.add(shape);
  }
}

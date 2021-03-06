package patterns.creational.prototype.practice;

import patterns.creational.prototype.practice.shapes.Circle;
import patterns.creational.prototype.practice.shapes.Rectangle;
import patterns.creational.prototype.practice.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class CloneDemo {
  private static void cloneAndCompare(List<Shape> shapes,
                                      List<Shape> shapesCopy){
    // 原型是很强大的东西，因为它能在不知晓对象类型的情况下生成一个与
    // 其完全相同的复制品。
    for (Shape shape : shapes) {
      shapesCopy.add(shape.clone());
    }

    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i)!=shapesCopy.get(i)) {
        System.out.println(i + ": Shapes are different objects (yay!)");
        if (shapes.get(i).equals(shapesCopy.get(i))) {
          System.out.println(i + ": And they are identical (yay!)");
        } else {
          System.out.println(i + ": But they are not identical (booo!)");
        }
      }else{
        System.out.println(i + ": Shape objects are same (boo)!");
      }
    }
  }

  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    List<Shape> shapesCopy = new ArrayList<>();

    Circle circle = new Circle();
    circle.x = 10;
    circle.y = 20;
    circle.radius = 15;
    circle.color = "red";
    shapes.add(circle);

    Circle anotherCircle = (Circle) circle.clone();
    shapes.add(anotherCircle);

    Rectangle rectangle = new Rectangle();
    rectangle.width = 10;
    rectangle.height = 20;
    rectangle.color = "blue";
    shapes.add(rectangle);

    cloneAndCompare(shapes, shapesCopy);
  }
}

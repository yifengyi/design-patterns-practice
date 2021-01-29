package patterns.creational.prototype.practice;

import patterns.creational.prototype.practice.cache.BundledShapeCache;
import patterns.creational.prototype.practice.shapes.Shape;

/**
 * 1.0v created by wujf on 2021-1-29
 */
public class CacheCloneDemo {
  public static void main(String[] args) {
    BundledShapeCache cache = new BundledShapeCache();
    Shape shape1 = cache.get("Big green circle");
    Shape shape2 = cache.get("Medium blue rectangle");
    Shape shape3 = cache.get("Medium blue rectangle");

    if (shape1 != shape2 && !shape1.equals(shape2)) {
      System.out.println("Big green circle != Medium blue rectangle (yay!)");
    } else {
      System.out.println("Big green circle == Medium blue rectangle (booo!)");
    }

    if (shape2 != shape3) {
      System.out.println("Medium blue rectangles are two different objects (yay!)");
      if (shape2.equals(shape3)) {
        System.out.println("And they are identical (yay!)");
      } else {
        System.out.println("But they are not identical (booo!)");
      }
    } else {
      System.out.println("Rectangle objects are the same (booo!)");
    }
  }
}

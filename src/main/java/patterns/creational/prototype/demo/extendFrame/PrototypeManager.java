package patterns.creational.prototype.demo.extendFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class PrototypeManager {
  private Map<String, Shape> ht = new HashMap<String, Shape>();
  public PrototypeManager() {
    ht.put("Circle", new Circle());
    ht.put("Square", new Square());
  }
  public void addshape(String key, Shape obj) {
    ht.put(key, obj);
  }
  public Shape getShape(String key) {
    Shape temp = ht.get(key);
    return (Shape) temp.clone();
  }
}

package patterns.structural.flyweight.demo.baseFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class FlyweightFactory {
  private Map<String, Flyweight> flyweights = new HashMap<>();
  public Flyweight getFlyweight(String key) {
    Flyweight flyweight =  flyweights.get(key);
    if (flyweight != null) {
      System.out.println("具体享元" + key + "已经存在，被成功获取！");
    } else {
      flyweight = new ConcreteFlyweight(key);
      flyweights.put(key, flyweight);
    }
    return flyweight;
  }
}

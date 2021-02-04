package patterns.structural.flyweight.practice.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class TreeFactory {
  static Map<String, TreeType> treeTypes = new HashMap<>();
  public static TreeType getTreeType(String name, Color color,String otherTreeData){
    TreeType result = treeTypes.get(name);
    if (result == null) {
      result = new TreeType(name, color, otherTreeData);
      treeTypes.put(name, result);
    }
    return result;
  }
}


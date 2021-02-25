package patterns.structural.flyweight.practice.forest;

import patterns.structural.flyweight.practice.trees.Tree;
import patterns.structural.flyweight.practice.trees.TreeFactory;
import patterns.structural.flyweight.practice.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * // 树（Tree）和森林（Forest）类是享元的客户端。如果不打算继续对树类进行开
 * // 发，你可以将它们合并。
 * 1.0v created by wujf on 2021-2-3
 */
public class Forest extends JFrame {
  private List<Tree> trees = new ArrayList<>();
  public void plantTree(int x, int y, String name, Color color, String otherTreeData){
    TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}

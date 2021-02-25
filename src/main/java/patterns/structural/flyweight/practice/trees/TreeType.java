package patterns.structural.flyweight.practice.trees;

import java.awt.*;

/**
 * // 享元类包含一个树的部分状态。这些成员变量保存的数值对于特定树而言是唯一
 * // 的。例如，你在这里找不到树的坐标。但这里有很多树木之间所共有的纹理和颜
 * // 色。由于这些数据的体积通常非常大，所以如果让每棵树都其进行保存的话将耗
 * // 费大量内存。因此，我们可将纹理、颜色和其他重复数据导出到一个单独的对象
 * // 中，然后让众多的单个树对象去引用它。
 * 1.0v created by wujf on 2021-2-3
 */
public class TreeType {
  private String name;
  private Color color;
  private String othereTreeData;

  public TreeType(String name, Color color, String othereTreeData) {
    this.name = name;
    this.color = color;
    this.othereTreeData = othereTreeData;
  }
  public void draw(Graphics g,int x,int y){
    g.setColor(Color.BLACK);
    g.fillRect(x-1,y,3,5);
    g.setColor(color);
    g.fillOval(x-5,y-10,10,10);
  }
}

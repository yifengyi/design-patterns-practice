package patterns.structural.composite.practice.shapes;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * // 组合类表示可能包含子项目的复杂组件。组合对象通常会将实际工作委派给子项
 * // 目，然后“汇总”结果。
 * 1.0v created by wujf on 2021-2-2
 */
public class CompoundShape extends BaseShape {
  protected List<Shape> children = new ArrayList<>();

  public CompoundShape(Shape... components) {
    super(0, 0, Color.BLACK);
    add(components);
  }

  // 组合对象可在其项目列表中添加或移除其他组件（简单的或复杂的皆可）。
  public void add(Shape component) {
    children.add(component);
  }

  public void add(Shape... components) {
    children.addAll(Arrays.asList(components));
  }

  public void remove(Shape child) {
    children.remove(child);
  }

  public void remove(Shape... components) {
    children.removeAll(Arrays.asList(components));
  }

  public void clear() {
    children.clear();
  }

  // 组合会以特定的方式执行其主要逻辑。它会递归遍历所有子项目，并收集和
  // 汇总其结果。由于组合的子项目也会将调用传递给自己的子项目，以此类推，
  // 最后组合将会完成整个对象树的遍历工作。
  @Override
  public int getX() {
    if (children.size() == 0) {
      return 0;
    }
    int x = children.get(0).getX();
    for (Shape child : children) {
      if (child.getX() < x) {
        x = child.getX();
      }
    }
    return x;
  }

  @Override
  public int getY() {
    if (children.size() == 0) {
      return 0;
    }
    int y = children.get(0).getY();
    for (Shape child : children) {
      if (child.getY() < y) {
        y = child.getY();
      }
    }

    return y;
  }

  @Override
  public int getWidth() {
    int maxWidth = 0;
    int x = getX();
    for (Shape child : children) {
      int childsRelativeX = child.getX() - x;
      int childWidth = childsRelativeX + child.getWidth();
      if (childWidth > maxWidth) {
        maxWidth = childWidth;
      }
    }
    return maxWidth;
  }

  @Override
  public int getHeight() {
    int maxHeight = 0;
    int y = getY();
    for (Shape child : children) {
      int childsRelativeY = child.getY() - y;
      int childHeight = childsRelativeY + child.getHeight();
      if (childHeight > maxHeight) {
        maxHeight = childHeight;
      }
    }
    return maxHeight;
  }

  @Override
  public void move(int x, int y) {
    for (Shape child : children) {
      child.move(x, y);
    }
  }

  @Override
  public boolean isInsideBounds(int x, int y) {
    for (Shape child : children) {
      if (child.isInsideBounds(x,y)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void unSelect() {
    super.unSelect();
    for (Shape child : children) {
      child.unSelect();
    }
  }
  public boolean selectChildAt(int x,int y){
    for (Shape child : children) {
      if (child.isInsideBounds(x,y)) {
        child.select();
        return true;
      }
    }
    return false;
  }

  @Override
  public void paint(Graphics graphics) {
    if (isSelected()) {
      enableSelectionStyle(graphics);
      graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
      disableSelectionStyle(graphics);
    }
    for (Shape child : children) {
      child.paint(graphics);
    }
  }
}

package patterns.structural.composite.demo.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Bags implements Articles {
  private String name;

  private List<Articles> children = new ArrayList<>();

  public Bags(String name) {
    this.name = name;
  }

  public void add(Articles a){
    children.add(a);
  }
  public void remove(Articles a){
    children.remove(a);
  }

  @Override
  public double calculation() {
    double res = 0;
    for (Articles child : children) {
     res+= child.calculation();
    }
    return res;
  }

  @Override
  public void show() {
    for (Articles child : children) {
      child.show();
    }
  }
}

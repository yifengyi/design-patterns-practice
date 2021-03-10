package patterns.behavioral.visitor.demo.coinage;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class SetMaterial {
  private List<Material> materials = new ArrayList<>();


  public String accept(Company company){
    String res = "";
    for (Material material : materials) {
      res += material.accept(company) + " ";
    }
    return res;
  }

  public void add(Material material){
    materials.add(material);
  }
  public void remove(Material material){
    materials.remove(material);
  }
}

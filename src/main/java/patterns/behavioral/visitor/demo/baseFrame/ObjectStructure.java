package patterns.behavioral.visitor.demo.baseFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class ObjectStructure {
  private List<Element> elements = new ArrayList<>();


  public void accept(Visitor visitor){
    for (Element element : elements) {
      element.accept(visitor);
    }
  }

  public void add(Element element){
    elements.add(element);
  }

  public void remove(Element element){
    elements.remove(element);
  }
}

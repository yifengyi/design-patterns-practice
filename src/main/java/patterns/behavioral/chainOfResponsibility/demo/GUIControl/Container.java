package patterns.behavioral.chainOfResponsibility.demo.GUIControl;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Container  extends Component{
  private List<Component> children;

  public Container() {
  }

  public Container(String tooltipText) {
    super.tooltipText = tooltipText;
  }



  public void add(Component child){
    if (children == null) {
      this.children = new ArrayList<>();
    }
    children.add(child);
    child.container =this;
  }


}

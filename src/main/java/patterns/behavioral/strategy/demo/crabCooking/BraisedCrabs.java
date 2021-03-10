package patterns.behavioral.strategy.demo.crabCooking;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class BraisedCrabs extends JLabel implements CrabCooking {
  @Override
  public void cookingMethod() {
    ClassLoader loader = this.getClass().getClassLoader();
    this.setIcon(new ImageIcon(loader.getResource("behavioral/stragety/demo/crabCooking/BraisedCrabs.jpg")));
    this.setHorizontalAlignment(CENTER);
  }
}

package patterns.structural.facade.demo.localSpeciality;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Specialty2 extends ImageIcon {
  public Specialty2() {
    super(Specialty2.class.getClassLoader().getResource("structural/facade/demo/localSpeciality/Specialty12.jpg"));

  }
}

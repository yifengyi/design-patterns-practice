package patterns.structural.facade.demo.localSpeciality;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Specialty1 extends ImageIcon {
  Specialty1() {
    super(Specialty1.class.getClassLoader().getResource("structural/facade/demo/localSpeciality/Specialty11.jpg"));
  }


}

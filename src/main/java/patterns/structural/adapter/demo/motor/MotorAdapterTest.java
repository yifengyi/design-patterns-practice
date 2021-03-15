package patterns.structural.adapter.demo.motor;

import patterns.creational.factoryMethod.demo.util.ReadXML;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class MotorAdapterTest {
  public static void main(String[] args) {
    System.out.println("适配器模式测试：");
    String path = "structural/adapter/demo/motor/config.xml";
    Motor motor=(Motor)ReadXML.getObject(path);
    motor.drive();
  }
}

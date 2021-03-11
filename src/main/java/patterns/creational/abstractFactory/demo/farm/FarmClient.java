package patterns.creational.abstractFactory.demo.farm;

import patterns.creational.factoryMethod.demo.util.ReadXML;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class FarmClient {
  public static void main(String[] args) {
    String path = "creational/abstractFactory/demo/farm/config2.xml";
    Farm factory =(Farm) ReadXML.getObject(path);
    factory.newPlant().show();
    factory.newAnimal().show();

  }
}

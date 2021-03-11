package patterns.creational.factoryMethod.demo.animalFarm;

import patterns.creational.factoryMethod.demo.util.ReadXML;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class FarmClient {
  public static void main(String[] args) {
    String path = "creational/factoryMethod/demo/animalFarm/config2.xml";
    AnimalFarm farm =(AnimalFarm) ReadXML.getObject(path);

    Animal an = farm.newAnimal();
    an.show();
  }
}

package patterns.creational.factoryMethod.demo.animalFarm;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class HorseFarme implements AnimalFarm {
  @Override
  public Animal newAnimal() {
    System.out.println("新马出生！");
    return new Horse();
  }
}

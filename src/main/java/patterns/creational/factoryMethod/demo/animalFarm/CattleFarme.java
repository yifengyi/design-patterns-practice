package patterns.creational.factoryMethod.demo.animalFarm;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class CattleFarme implements AnimalFarm {
  @Override
  public Animal newAnimal() {
    System.out.println("新牛出生！");
    return new Cattle();
  }
}

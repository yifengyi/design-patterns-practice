package patterns.creational.abstractFactory.demo.farm;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class SRFarm implements Farm {
  @Override
  public Animal newAnimal() {
    System.out.println("新马出生！");
    return new Horse();
  }

  @Override
  public Plant newPlant() {
    System.out.println("水果长成！");
    return new Fruitage();
  }
}

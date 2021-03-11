package patterns.creational.abstractFactory.demo.farm;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class SGFarm implements Farm {
  @Override
  public Animal newAnimal() {
    System.out.println("新牛出生！");
    return new Cattle();
  }

  @Override
  public Plant newPlant() {
    System.out.println("蔬菜长成！");
    return new Vegetable();
  }
}

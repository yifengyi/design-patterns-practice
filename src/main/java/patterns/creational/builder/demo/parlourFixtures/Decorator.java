package patterns.creational.builder.demo.parlourFixtures;

/**
 * 抽象建造者：装修工人
 * 1.0v created by wujf on 2021-3-11
 */
public abstract class Decorator {
  protected Parlour parlour = new Parlour();


  public abstract void buildWall();
  public abstract void buildTV();
  public abstract void buildSofa();

  public Parlour getResult(){
    return parlour;
  }
}

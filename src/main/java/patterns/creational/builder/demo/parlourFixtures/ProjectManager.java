package patterns.creational.builder.demo.parlourFixtures;

/**
 * 指挥者：项目经理
 * 1.0v created by wujf on 2021-3-11
 */
public class ProjectManager {
  private Decorator decorator;

  public ProjectManager(Decorator decorator) {
    this.decorator = decorator;
  }

  public Parlour decorate(){
    decorator.buildWall();
    decorator.buildTV();
    decorator.buildSofa();
    return decorator.getResult();
  }
}

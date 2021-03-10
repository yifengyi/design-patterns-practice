package patterns.behavioral.visitor.demo.coinage;

/**
 * 造币厂
 * 1.0v created by wujf on 2021-3-10
 */
public class Mint implements Company {
  @Override
  public String create(Paper paper) {
    return "纸币";
  }

  @Override
  public String create(Copper cuprum) {
    return "铜币";
  }
}

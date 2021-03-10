package patterns.behavioral.visitor.demo.coinage;

/**
 * 纸
 * 1.0v created by wujf on 2021-3-10
 */
public class Paper implements Material {
  @Override
  public String accept(Company company) {
    return company.create(this);
  }
}

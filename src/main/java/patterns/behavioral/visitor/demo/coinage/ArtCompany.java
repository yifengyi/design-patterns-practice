package patterns.behavioral.visitor.demo.coinage;

/**
 * 艺术厂
 * 1.0v created by wujf on 2021-3-10
 */
public class ArtCompany implements Company {
  @Override
  public String create(Paper paper) {
    return "讲学图";
  }

  @Override
  public String create(Copper cuprum) {
    return "朱熹铜像";
  }
}

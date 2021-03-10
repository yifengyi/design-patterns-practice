package patterns.behavioral.visitor.demo.coinage;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public interface Company {
  String create(Paper paper);

  String create(Copper cuprum);
}

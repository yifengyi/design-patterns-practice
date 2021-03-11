package patterns.creational.builder.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  //产品构建与组装方法
  public Product construct(){
    builder.buildPartA();
    builder.buildPartB();
    builder.buildPartC();
    return builder.getResult();
  }
}

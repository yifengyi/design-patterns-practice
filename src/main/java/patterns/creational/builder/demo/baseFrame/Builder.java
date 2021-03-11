package patterns.creational.builder.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public abstract class Builder {
  protected  Product product = new Product();

  public abstract void buildPartA();
  public abstract void buildPartB();
  public abstract void buildPartC();

  public Product getResult(){
    return product;
  }

}

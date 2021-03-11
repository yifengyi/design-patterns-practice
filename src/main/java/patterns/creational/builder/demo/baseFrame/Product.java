package patterns.creational.builder.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Product {
  private String partA;
  private String partB;
  private String partC;

  public void setPartA(String partA) {
    this.partA = partA;
  }

  public void setPartB(String partB) {
    this.partB = partB;
  }

  public void setPartC(String partC) {
    this.partC = partC;
  }

  public void show(){
    System.out.println("展示产品特性");
  }
}

package patterns.structural.composite.demo.product;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class Goods implements Articles {
  private String name;
  private int qty;
  private double unitPrice;

  public Goods(String name, int qty, double unitPrice) {
    this.name = name;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  @Override
  public double calculation() {
    return qty * unitPrice;
  }

  @Override
  public void show() {
    System.out.println(name + "(数量：" + qty + "，单价：" + unitPrice + "元)");
  }
}

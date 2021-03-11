package patterns.creational.prototype.demo.certificate;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Certificate implements Cloneable {
  private String name;
  private String info;
  private String collage;

  public Certificate(String name, String info, String collage) {
    this.name = name;
    this.info = info;
    this.collage = collage;
    System.out.println("奖状创建成功");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void display(){
    System.out.println(name + info + collage);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    System.out.println("奖状克隆成功");
    return ((Certificate) super.clone());
  }
}

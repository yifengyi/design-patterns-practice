package patterns.behavioral.iterator.demo.wyScenic;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class WyViewSpot {
  private String name;
  private String introduce;

  public WyViewSpot(String name, String introduce) {
    this.name = name;
    this.introduce = introduce;
  }

  public String getName() {
    return name;
  }

  public String getIntroduce() {
    return introduce;
  }
}

package patterns.behavioral.memento.bindDate;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class Yourself {
  private String girlName;

  public String getGirlName() {
    return girlName;
  }

  public void setGirlName(String girlName) {
    this.girlName = girlName;
  }

  public Girl holdingGirl(){
    return new Girl(girlName);
  }

  public void restoreHoldingGirl(Girl g){
    setGirlName(g.getName());
  }
}

package patterns.behavioral.command.demo.restaurant;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Waiter {
  private Breakfast changFen,heFen,hunTun;

  public void setChangFen(Breakfast changFen) {
    this.changFen = changFen;
  }

  public void setHeFen(Breakfast heFen) {
    this.heFen = heFen;
  }

  public void setHunTun(Breakfast hunTun) {
    this.hunTun = hunTun;
  }

  public void chooseChangFen(){
    changFen.cooking();
  }
  public void chooseHeFen(){
    heFen.cooking();
  }
  public  void chooseHunTun(){
    hunTun.cooking();
  }
}

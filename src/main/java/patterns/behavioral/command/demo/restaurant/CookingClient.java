package patterns.behavioral.command.demo.restaurant;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class CookingClient {
  public static void main(String[] args) {
    Breakfast food1 = new ChangFen();
    Breakfast food2 = new HunTun();
    Breakfast food3 = new HeFen();
    Waiter fwy = new Waiter();
    fwy.setChangFen(food1);//设置肠粉菜单
    fwy.setHunTun(food2);  //设置河粉菜单
    fwy.setHeFen(food3);   //设置馄饨菜单
    fwy.chooseChangFen();  //选择肠粉
    fwy.chooseHeFen();     //选择河粉
    fwy.chooseHunTun();    //选择馄饨
  }
}

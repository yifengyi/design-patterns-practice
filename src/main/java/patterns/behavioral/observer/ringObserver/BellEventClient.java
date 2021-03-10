package patterns.behavioral.observer.ringObserver;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class BellEventClient {
  public static void main(String[] args) {
    BellEventSource bell = new BellEventSource();    //铃（事件源）
    bell.add(new TeacherEventListener()); //注册监听器（老师）
    bell.add(new StudentEventListener());    //注册监听器（学生）
    bell.ring(true);   //打上课铃声
    System.out.println("------------");
    bell.ring(false);  //打下课铃声
  }
}

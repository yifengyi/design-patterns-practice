package patterns.behavioral.observer.ringObserver;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public class TeacherEventListener implements BellEventListener {
  @Override
  public void heardBell(RingEvent event) {
    if (event.isSound()) {
      System.out.println("老师上课了...");
    }else{
      System.out.println("老师下课了...");
    }
  }
}

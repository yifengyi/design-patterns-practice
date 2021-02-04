package patterns.behavioral.chainOfResponsibility.practice.middleware;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class ThrottlingMiddleware extends Middleware {
  private int  requestPerMinute;
  private int  request;
  private long currentTime;

  public ThrottlingMiddleware(int requestPerMinute) {
    this.requestPerMinute = requestPerMinute;
    this.currentTime = System.currentTimeMillis();
  }

  @Override
  public boolean check(String email, String password) {
    if (System.currentTimeMillis() > currentTime) {
      request = 0;
      currentTime = System.currentTimeMillis();
    }
    request++;
    if (request > requestPerMinute) {
      System.out.println("Request limit exceeded!");
      Thread.currentThread().interrupt();
      // Thread.currentThread().stop();
    }

    return checkNext(email, password);
  }
}

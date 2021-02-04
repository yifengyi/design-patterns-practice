package patterns.behavioral.chainOfResponsibility.practice.middleware;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class RoleCheckMiddleware extends Middleware {

  @Override
  public boolean check(String email, String password) {
    if (email.equals("admin@example.com")) {
      System.out.println("Hello, admin!");
      return true;
    }
    System.out.println("Hello, user!");
    return checkNext(email, password);
  }
}

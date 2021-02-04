package patterns.behavioral.chainOfResponsibility.practice.middleware;

import patterns.behavioral.chainOfResponsibility.practice.server.Server;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class UserExistsMiddleware extends Middleware {
  private Server server;

  public UserExistsMiddleware(Server server) {
    this.server = server;
  }


  @Override
  public boolean check(String email, String password) {
    if(!server.hasEmail(email)){
      System.out.println("This email is not registered!");
      return false;
    }
    if (!server.isValidPassword(email, password)) {
      System.out.println("Wrong password!");
      return false;
    }
    return checkNext(email, password);
  }
}

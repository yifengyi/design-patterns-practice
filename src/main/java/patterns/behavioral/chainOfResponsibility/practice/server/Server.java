package patterns.behavioral.chainOfResponsibility.practice.server;

import patterns.behavioral.chainOfResponsibility.practice.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Server {
  private Map<String, String> users = new HashMap<>();

  private Middleware middleware;

  public void setMiddleware(Middleware middleware) {
    this.middleware = middleware;
  }
  public boolean logIn(String email, String password) {
    if (middleware.check(email, password)) {
      System.out.println("Authorization have been successful!");

      // Do something useful here for authorized users.

      return true;
    }
    return false;
  }
  public void register(String email, String password) {
    users.put(email, password);
  }

  public boolean hasEmail(String email) {
    return users.containsKey(email);
  }

  public boolean isValidPassword(String email, String password) {
    return users.get(email).equals(password);
  }
}

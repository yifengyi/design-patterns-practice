package patterns.behavioral.chainOfResponsibility.practice;

import patterns.behavioral.chainOfResponsibility.practice.middleware.Middleware;
import patterns.behavioral.chainOfResponsibility.practice.middleware.RoleCheckMiddleware;
import patterns.behavioral.chainOfResponsibility.practice.middleware.ThrottlingMiddleware;
import patterns.behavioral.chainOfResponsibility.practice.middleware.UserExistsMiddleware;
import patterns.behavioral.chainOfResponsibility.practice.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class ChainDemoClient {
  private static BufferedReader reader
          = new BufferedReader(new InputStreamReader(System.in));

  private static Server server;

  private static void init(){
    server = new Server();
    server.register("admin@example.com", "admin_pass");
    server.register("user@example.com", "user_pass");

    // All checks are linked. Client can build various chains using the same
    // components.
    Middleware middleware = new ThrottlingMiddleware(2);
    middleware.linkWith(new UserExistsMiddleware(server))
            .linkWith(new RoleCheckMiddleware());

    // Server gets a chain from client code.
    server.setMiddleware(middleware);
  }

  public static void main(String[] args) throws IOException {
    init();

    boolean success;
    do{
      System.out.print("Enter email: ");
      String email = reader.readLine();
      System.out.print("Input password: ");
      String password = reader.readLine();
      success = server.logIn(email, password);
    } while (!success);
  }
}

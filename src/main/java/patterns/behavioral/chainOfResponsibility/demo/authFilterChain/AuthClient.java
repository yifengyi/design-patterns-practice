package patterns.behavioral.chainOfResponsibility.demo.authFilterChain;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class AuthClient {
  public static void main(String[] args) {
    AuthLink link = new UsernameAuth();
    link.linkNext(new EmailAuth());

    link.doAuth(null,"aaa123");
  }
}

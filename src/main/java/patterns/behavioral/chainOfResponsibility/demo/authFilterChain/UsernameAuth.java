package patterns.behavioral.chainOfResponsibility.demo.authFilterChain;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class UsernameAuth extends AuthLink {
  @Override
  public void doAuth(String username, String email) {
    if (Objects.isNull(username)) {
      System.out.println("用户名不能为空");
    }
    if (super.next != null) {
      super.next.doAuth(username,email);
    }
  }
}

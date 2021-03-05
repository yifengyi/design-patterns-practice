package patterns.behavioral.chainOfResponsibility.demo.authFilterChain;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class EmailAuth extends AuthLink {
  @Override
  public void doAuth(String username, String email) {
    if (Objects.isNull(email)) {
      System.out.println("邮箱地址不能为空");
      return;
    }
    if (!email.contains("@")) {
      System.out.println("邮箱地址不合法");
    }
    if (super.next != null) {
      super.next.doAuth(username,email);
    }

  }
}

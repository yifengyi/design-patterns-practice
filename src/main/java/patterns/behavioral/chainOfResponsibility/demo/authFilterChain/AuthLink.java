package patterns.behavioral.chainOfResponsibility.demo.authFilterChain;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public abstract class AuthLink {
  protected AuthLink next;

  public AuthLink linkNext(AuthLink next){
    this.next = next;
    return next;
  }

  public abstract void doAuth(String username,String email);
}

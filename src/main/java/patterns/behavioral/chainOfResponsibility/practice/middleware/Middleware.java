package patterns.behavioral.chainOfResponsibility.practice.middleware;

/**
 *  简单组件的基础
 * 1.0v created by wujf on 2021-2-3
 */
public abstract class Middleware {
  // 组件容器在处理者链中作为“下一个”链接。
  private Middleware next;

  public Middleware linkWith(Middleware next){
    this.next = next;
    return next;
  }

  public abstract boolean check(String email, String password);


  protected boolean checkNext(String email,String password){
    if (next == null) {
      return true;
    }
    return next.check(email, password);
  }
}

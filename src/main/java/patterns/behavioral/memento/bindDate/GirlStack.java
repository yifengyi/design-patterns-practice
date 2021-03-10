package patterns.behavioral.memento.bindDate;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class GirlStack {
  private Girl[] girls;
  private int top;

  public GirlStack() {
    girls = new Girl[5];
    top = -1;
  }

  public boolean push(Girl g){
    if (top >=4) {
      System.out.println("你太花心了，变来变去的！");
      return false;
    }else {
      girls[++top] = g;
      return true;
    }
  }

  public Girl pop(){
    if (top<=0) return girls[0];
    return girls[--top];
  }
}

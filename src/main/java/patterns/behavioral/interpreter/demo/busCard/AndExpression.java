package patterns.behavioral.interpreter.demo.busCard;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class AndExpression implements Expression {
  private Expression city = null;
  private Expression person = null;

  public AndExpression(Expression city, Expression person) {
    this.city = city;
    this.person = person;
  }

  @Override
  public boolean interpret(String info) {
    String s[] = info.split("的");
    return city.interpret(s[0]) && person.interpret(s[1]);
  }
}

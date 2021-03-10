package patterns.behavioral.interpreter.demo.busCard;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class TerminalExpression implements Expression {
  private Set<String> vars = new HashSet<>();

  public TerminalExpression(String ...data) {
    for (String datum : data) {
      vars.add(datum);
    }
  }

  @Override
  public boolean interpret(String info) {
    return vars.contains(info);
  }
}

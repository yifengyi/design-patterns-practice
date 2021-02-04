package patterns.behavioral.command.practice.commands;

import java.util.Stack;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class CommandHistory {
  private Stack<Command> history = new Stack<>();
  public void push(Command c){
    history.push(c);
  }
  public Command pop(){
    return history.pop();
  }

  public boolean isEmpty(){
    return history.isEmpty();
  }
}

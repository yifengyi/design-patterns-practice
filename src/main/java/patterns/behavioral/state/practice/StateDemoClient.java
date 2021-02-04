package patterns.behavioral.state.practice;

import patterns.behavioral.state.practice.ui.Player;
import patterns.behavioral.state.practice.ui.UI;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class StateDemoClient {
  public static void main(String[] args) {
    Player player = new Player();
    UI ui = new UI(player);
    ui.init();
  }
}

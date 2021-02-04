package patterns.behavioral.state.practice.states;

import patterns.behavioral.state.practice.ui.Player;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public abstract class State {
  Player player;

  State(Player player) {
    this.player = player;
  }
  public abstract String onLock();
  public abstract String onPlay();
  public abstract String onNext();
  public abstract String onPrevious();
}

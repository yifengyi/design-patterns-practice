package patterns.behavioral.state.practice.states;

import patterns.behavioral.state.practice.ui.Player;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class ReadyState extends State {
  public ReadyState(Player player) {
    super(player);
  }

  @Override
  public String onLock() {
    player.changeState(new LockedState(player));
    return "Locked...";
  }

  @Override
  public String onPlay() {
    String action = player.startPlayback();
    player.changeState(new PlayingState(player));
    return action;
  }

  @Override
  public String onNext() {
    return "Locked...";
  }

  @Override
  public String onPrevious() {
    return "Locked...";
  }
}

package patterns.behavioral.state.practice.states;

import patterns.behavioral.state.practice.ui.Player;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class LockedState extends State {
  LockedState(Player player) {
    super(player);
    player.setPlaying(false);
  }

  @Override
  public String onLock() {
    if (player.isPlaying()) {
      player.changeState(new ReadyState(player));
      return "Stop playing";
    } else {
      return "Locked...";
    }
  }

  @Override
  public String onPlay() {
    player.changeState(new ReadyState(player));
    return "Ready";
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

package patterns.behavioral.state.practice.states;

import patterns.behavioral.state.practice.ui.Player;

/**
 * 1.0v created by wujf on 2021-2-4
 */
public class PlayingState extends State {
  PlayingState(Player player) {
    super(player);
  }

  @Override
  public String onLock() {
    player.changeState(new LockedState(player));
    player.setCurrentTrackAfterStop();
    return "Stop playing";
  }

  @Override
  public String onPlay() {
    player.changeState(new ReadyState(player));
    return "Paused...";
  }

  @Override
  public String onNext() {
    return player.nextTrack();
  }

  @Override
  public String onPrevious() {
    return player.previousTrack();
  }
}

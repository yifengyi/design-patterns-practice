package patterns.structural.bridge.practice.devices;

/**
 * 1.0v created by wujf on 2021-2-2
 */
public interface Device {
  boolean isEnabled();

  void enable();

  void disable();

  int getVolume();

  void setVolume(int percent);

  int getChannel();

  void setChannel(int channel);

  void printStatus();
}

package patterns.structural.bridge.practice.devices;

/**
 * // “实现部分”接口声明了在所有具体实现类中通用的方法。它不需要与抽象接口相
 * // 匹配。实际上，这两个接口可以完全不一样。通常实现接口只提供原语操作，而
 * // 抽象接口则会基于这些操作定义较高层次的操作。
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

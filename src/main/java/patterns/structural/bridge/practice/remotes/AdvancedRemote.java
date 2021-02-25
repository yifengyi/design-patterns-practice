package patterns.structural.bridge.practice.remotes;

import patterns.structural.bridge.practice.devices.Device;

/**
 * // 你可以独立于设备类的方式从抽象层中扩展类。
 * 1.0v created by wujf on 2021-2-2
 */
public class AdvancedRemote extends BasicRemote {
  public AdvancedRemote(Device device) {
    super.device = device;
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }
}

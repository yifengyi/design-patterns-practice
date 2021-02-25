package patterns.structural.bridge.practice;

import patterns.structural.bridge.practice.devices.Device;
import patterns.structural.bridge.practice.devices.Radio;
import patterns.structural.bridge.practice.devices.Tv;
import patterns.structural.bridge.practice.remotes.AdvancedRemote;
import patterns.structural.bridge.practice.remotes.BasicRemote;

/**
 * 远程控制器是抽象部分， 设备则是其实现部分。
 * 由于有通用的接口， 同一远程控制器可与不同的设备合作， 反过来也一样。
 * 1.0v created by wujf on 2021-2-2
 */
public class BridgeDemoClient {
  public static void main(String[] args) {
    testDevice(new Tv());
    testDevice(new Radio());

  }
  public static void testDevice(Device device){
    System.out.println("Tests with basic remote");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Tests with advanced remote");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}

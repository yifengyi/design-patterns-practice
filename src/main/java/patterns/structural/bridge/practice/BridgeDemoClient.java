package patterns.structural.bridge.practice;

import patterns.structural.bridge.practice.devices.Device;
import patterns.structural.bridge.practice.devices.Radio;
import patterns.structural.bridge.practice.devices.Tv;
import patterns.structural.bridge.practice.remotes.AdvancedRemote;
import patterns.structural.bridge.practice.remotes.BasicRemote;

/**
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

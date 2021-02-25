package patterns.creational.builder.practice.builders;

import patterns.creational.builder.practice.cars.CarType;
import patterns.creational.builder.practice.components.Engine;
import patterns.creational.builder.practice.components.GPSNavigator;
import patterns.creational.builder.practice.components.Transmission;
import patterns.creational.builder.practice.components.TripComputer;

/**
 * // 生成器接口声明了创建产品对象不同部件的方法。
 * 1.0v created by wujf on 2021-1-29
 * 通用生成器接口
 */
public interface Builder {
  void setCarType(CarType type);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transmission transmission);

  void setTripComputer(TripComputer tripComputer);

  void setGPSNavigator(GPSNavigator gpsNavigator);
}

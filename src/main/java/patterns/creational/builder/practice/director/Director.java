package patterns.creational.builder.practice.director;

import patterns.creational.builder.practice.builders.Builder;
import patterns.creational.builder.practice.cars.CarType;
import patterns.creational.builder.practice.components.Engine;
import patterns.creational.builder.practice.components.GPSNavigator;
import patterns.creational.builder.practice.components.Transmission;
import patterns.creational.builder.practice.components.TripComputer;

/**
 * 1.0v created by wujf on 2021-1-29
 * 主管控制生成器
 */
public class Director {
  public void constructSportsCar(Builder builder) {
    builder.setCarType(CarType.SPORTS_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(3.0, 0));
    builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }

  public void contructCityCar(Builder builder) {
    builder.setCarType(CarType.CITY_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(1.2, 0));
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }

  public void contructSUV(Builder builder) {
    builder.setCarType(CarType.SUV);
    builder.setSeats(4);
    builder.setEngine(new Engine(2.5, 0));
    builder.setTransmission(Transmission.MANUAL);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }
}

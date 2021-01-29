package patterns.creational.builder.practice.builders;

import patterns.creational.builder.practice.cars.CarType;
import patterns.creational.builder.practice.cars.Manual;
import patterns.creational.builder.practice.components.Engine;
import patterns.creational.builder.practice.components.GPSNavigator;
import patterns.creational.builder.practice.components.Transmission;
import patterns.creational.builder.practice.components.TripComputer;

/**
 * 1.0v created by wujf on 2021-1-29
 * 汽车手册生成器
 */
public class CarManualBuilder implements Builder {
  private CarType      type;
  private int          seats;
  private Engine       engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  @Override
  public void setCarType(CarType type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Manual getResult() {
    return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}

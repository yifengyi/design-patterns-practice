package patterns.creational.builder.practice.cars;

import patterns.creational.builder.practice.components.Engine;
import patterns.creational.builder.practice.components.GPSNavigator;
import patterns.creational.builder.practice.components.Transmission;
import patterns.creational.builder.practice.components.TripComputer;

/**
 * 1.0v created by wujf on 2021-1-29
 * 汽车产品
 */
public class Car {
  private final CarType      carType;
  private final int          seats;
  private final Engine       engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GPSNavigator gpsNavigator;
  private       double       fuel = 0;

  public Car(CarType carType,
             int seats,
             Engine engine,
             Transmission transmission,
             TripComputer tripComputer,
             GPSNavigator gpsNavigator) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.tripComputer = tripComputer;
    this.gpsNavigator = gpsNavigator;
  }

  public CarType getCarType() {
    return carType;
  }

  public int getSeats() {
    return seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  public GPSNavigator getGpsNavigator() {
    return gpsNavigator;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
  }

  public double getFuel() {
    return fuel;
  }
}

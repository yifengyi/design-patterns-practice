package patterns.creational.builder.practice.components;

import patterns.creational.builder.practice.cars.Car;

/**
 * 1.0v created by wujf on 2021-1-29
 * 产品特征4：
 */
public class TripComputer {
  private Car car;

  public void setCar(Car car) {
    this.car = car;
  }

  public void showFuelLevel() {
    System.out.println("Fuel level: " + car.getFuel());
  }

  public void showStatus() {
    if (this.car.getEngine().isStarted()) {
      System.out.println("Car is started");
    } else {
      System.out.println("Car isn't started");
    }

  }
}

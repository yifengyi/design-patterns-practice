package patterns.creational.builder.practice;

import patterns.creational.builder.practice.builders.CarBuilder;
import patterns.creational.builder.practice.builders.CarManualBuilder;
import patterns.creational.builder.practice.cars.Car;
import patterns.creational.builder.practice.cars.Manual;
import patterns.creational.builder.practice.director.Director;

/**
 * 1.0v created by wujf on 2021-1-29
 * 客户端
 */
public class BuilderClientDemo {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);
    Car car = builder.getResult();
    System.out.println("Car built: " + car.getCarType());

    CarManualBuilder manualBuilder = new CarManualBuilder();
    director.constructSportsCar(manualBuilder);
    Manual manual = manualBuilder.getResult();
    System.out.println("\n Car manual built:\n" + manual.print());
  }
}

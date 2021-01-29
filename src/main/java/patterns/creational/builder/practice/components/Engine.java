package patterns.creational.builder.practice.components;

/**
 * 1.0v created by wujf on 2021-1-29
 * 产品特征1:引擎
 */
public class Engine {
  private final double  volume;
  private       double  mileage;
  private       boolean started;

  public Engine(double volume, double mileage) {
    this.volume = volume;
    this.mileage = mileage;
  }

  public void on() {
    this.started = true;
  }

  public void off() {
    this.started = false;
  }

  public boolean isStarted() {
    return started;
  }

  public void go(double mileage) {
    if (started) {
      this.mileage += mileage;
    } else {
      System.err.println("Cannot go(),you must start engine first!");
    }
  }

  public double getVolume() {
    return volume;
  }

  public double getMileage() {
    return mileage;
  }
}

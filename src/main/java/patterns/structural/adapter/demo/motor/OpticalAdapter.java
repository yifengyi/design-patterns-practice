package patterns.structural.adapter.demo.motor;

/**
 * 1.0v created by wujf on 2021-3-15
 */
public class OpticalAdapter implements Motor {
  private OpticalMotor motor;

  public OpticalAdapter() {
    this.motor = new OpticalMotor();
  }

  @Override
  public void drive() {
    motor.opticalDrive();
  }
}

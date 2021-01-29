package patterns.creational.builder.practice.components;

/**
 * 1.0v created by wujf on 2021-1-29
 * 产品特征2：GPS
 */
public class GPSNavigator {
  private String route;

  public GPSNavigator() {
    this.route = "222b XXX市";
  }

  public GPSNavigator(String manualRoute) {
    this.route = manualRoute;
  }

  public String getRoute() {
    return route;
  }
}

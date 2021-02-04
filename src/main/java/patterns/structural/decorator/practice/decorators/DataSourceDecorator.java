package patterns.structural.decorator.practice.decorators;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class DataSourceDecorator implements DataSource {
  private DataSource wrappee;

  DataSourceDecorator(DataSource wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public void writeData(String data) {
    wrappee.writeData(data);
  }

  @Override
  public String readData() {
    return wrappee.readData();
  }
}

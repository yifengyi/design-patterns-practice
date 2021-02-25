package patterns.structural.decorator.practice.decorators;

/**
 * // 装饰基类和其他组件遵循相同的接口。该类的主要任务是定义所有具体装饰的封
 * // 装接口。封装的默认实现代码中可能会包含一个保存被封装组件的成员变量，并
 * // 且负责对其进行初始化。
 * 1.0v created by wujf on 2021-2-3
 */
public class DataSourceDecorator implements DataSource {
  private DataSource wrappee;

  DataSourceDecorator(DataSource wrappee) {
    this.wrappee = wrappee;
  }

  // 装饰基类会直接将所有工作分派给被封装组件。具体装饰中则可以新增一些
  // 额外的行为。
  @Override
  public void writeData(String data) {
    wrappee.writeData(data);
  }

  @Override
  public String readData() {
    return wrappee.readData();
  }
}

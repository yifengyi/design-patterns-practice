package patterns.structural.decorator.practice.decorators;

/**
 * // 装饰可以改变组件接口所定义的操作。
 * 1.0v created by wujf on 2021-2-3
 */
public interface DataSource {
  void writeData(String data);

  String readData();
}

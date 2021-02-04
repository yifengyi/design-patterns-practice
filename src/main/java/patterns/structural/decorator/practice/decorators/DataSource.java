package patterns.structural.decorator.practice.decorators;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface DataSource {
  void writeData(String data);

  String readData();
}

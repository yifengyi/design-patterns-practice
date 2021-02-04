package patterns.structural.decorator.practice;


import patterns.structural.decorator.practice.decorators.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class DecoratorDemoClient {
  public static void main(String[] args) {
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
    DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                    new FileDataSource("target/OutputDemo.txt")));
    encoded.writeData(salaryRecords);
    DataSource plain = new FileDataSource("target/OutputDemo.txt");

    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encoded.readData());
  }
}

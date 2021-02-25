package patterns.structural.decorator.practice.decorators;

import java.util.Base64;

/**
 * // 具体装饰必须在被封装对象上调用方法，不过也可以自行在结果中添加一些内容。
 * // 装饰必须在调用封装对象之前或之后执行额外的行为。
 * 1.0v created by wujf on 2021-2-3
 */
public class EncryptionDecorator extends DataSourceDecorator {
  public EncryptionDecorator(DataSource wrappee) {
    super(wrappee);
  }

  @Override
  public void writeData(String data) {
    super.writeData(encode(data));
  }

  @Override
  public String readData() {
    return decode(super.readData());
  }

  private String encode(String data) {
    byte[] result = data.getBytes();
    for (int i = 0; i < result.length; i++) {
      result[i] += (byte) 1;
    }
    return Base64.getEncoder().encodeToString(result);
  }

  private String decode(String data) {
    byte[] result = Base64.getDecoder().decode(data);
    for (int i = 0; i < result.length; i++) {
      result[i] -= (byte) 1;
    }
    return new String(result);
  }
}

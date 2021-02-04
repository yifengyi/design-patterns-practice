package patterns.structural.decorator.practice.decorators;

import java.io.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class FileDataSource implements DataSource {
  private String name;

  public FileDataSource(String name) {
    this.name = name;
  }

  @Override
  public void writeData(String data) {
    File file = new File(name);
    try (OutputStream fos = new FileOutputStream(file)) {
      fos.write(data.getBytes(), 0, data.length());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

  @Override
  public String readData() {
    char[] buffer = null;
    File file = new File(name);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return new String(buffer);
  }
}

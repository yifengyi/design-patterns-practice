package patterns.creational.prototype.demo.certificate;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class Client {
  public static void main(String[] args) throws CloneNotSupportedException {
    Certificate obj1 = new Certificate("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
    obj1.display();
    Certificate obj2 = (Certificate) obj1.clone();
    obj2.setName("李四");
    obj2.display();
  }
}

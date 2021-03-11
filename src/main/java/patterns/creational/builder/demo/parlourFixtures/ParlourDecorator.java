package patterns.creational.builder.demo.parlourFixtures;

import patterns.creational.factoryMethod.demo.util.ReadXML;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ParlourDecorator {
  public static void main(String[] args) {
    String path = "creational/builder/demo/parlourFixtures/config.xml";
    Decorator builder =(Decorator) ReadXML.getObject(path);
    ProjectManager manager = new ProjectManager(builder);
    manager.decorate().show();
  }
}

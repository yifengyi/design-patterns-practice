package patterns.creational.factoryMethod.demo.baseFrame;

import patterns.creational.factoryMethod.demo.util.ReadXML;

/**
 * 工厂方法模式的主要角色如下。
 *  1.抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 *  2.具体工厂（ConcreteFactory1）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 *  3.抽象产品（ProductA）：定义了产品的规范，描述了产品的主要特性和功能。
 *  4.具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 * 1.0v created by wujf on 2021-3-11
 */
public class FactoryClient {
  public static void main(String[] args) {
    try {
      String path = "creational/factoryMethod/demo/baseFrame/config1.xml";
      Product a;
      AbstractFactory af;
      af = (AbstractFactory) ReadXML.getObject(path);
      a = af.newProduct();
      a.show();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

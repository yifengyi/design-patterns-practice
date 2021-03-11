package patterns.creational.abstractFactory.demo.baseFrame;

/**
 * 抽象工厂模式的主要角色如下。
 *  1.抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 *  2.具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 *  3.抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 *  4.具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 * 1.0v created by wujf on 2021-3-11
 */
public class AbstractFactoryClient {
  public static void main(String[] args) {
    AbstractFactory factory = new ConcreteFactory1();

    factory.newProductA().show();
  }
}

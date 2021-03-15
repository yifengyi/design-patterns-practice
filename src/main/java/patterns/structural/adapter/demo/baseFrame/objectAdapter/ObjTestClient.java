package patterns.structural.adapter.demo.baseFrame.objectAdapter;

import patterns.structural.adapter.demo.baseFrame.Adaptee;
import patterns.structural.adapter.demo.baseFrame.Target;

/**
 * 适配器模式（Adapter）包含以下主要角色。
 *  *  1.目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 *  *  2.适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *  *  3.适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把
 *  *   适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *  * 类适配器模式的代码如下
 * 1.0v created by wujf on 2021-3-15
 */
public class ObjTestClient {
  public static void main(String[] args) {
    System.out.println("对象适配器模式测试：");
    Target t = new ObjectAdapter(new Adaptee());
    t.request();
  }
}

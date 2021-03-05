package patterns.behavioral.iterator.demo.baseFrame;

/**
 * 迭代器模式主要包含以下角色。
 *  1.抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 *  2.具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 *  3.抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 *  4.具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * 1.0v created by wujf on 2021-3-5
 */
public interface Aggregate<T> {
  void add(T t);

  void remove(T t);

  Iterator<T> getIterator();
}

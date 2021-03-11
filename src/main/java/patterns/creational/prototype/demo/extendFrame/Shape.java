package patterns.creational.prototype.demo.extendFrame;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public interface Shape extends Cloneable {

  Object clone();

  void countArea();
}

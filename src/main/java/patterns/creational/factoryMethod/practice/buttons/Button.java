package patterns.creational.factoryMethod.practice.buttons;

/**
 * // 产品接口中将声明所有具体产品都必须实现的操作。
 * 1.0v created by wujf on 2021-1-29
 * 通用产品接口
 */
public interface Button {
  void render();
  void onClick();
}

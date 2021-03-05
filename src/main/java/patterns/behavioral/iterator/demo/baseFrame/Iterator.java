package patterns.behavioral.iterator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public interface Iterator<T> {
  T first();

  T next();

  boolean hasNext();
}

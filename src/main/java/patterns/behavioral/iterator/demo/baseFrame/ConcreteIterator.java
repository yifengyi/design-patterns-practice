package patterns.behavioral.iterator.demo.baseFrame;

import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteIterator<T> implements Iterator<T> {

  private List<T> list = null;
  private int     index=-1;

  public ConcreteIterator(List<T> list) {
    this.list = list;
  }

  @Override
  public T first() {
    index = 0;
    return list.get(index);
  }

  @Override
  public T next() {
    T t = null;
    if (this.hasNext()) {
      t = list.get(++index);
    }
    return t;
  }

  @Override
  public boolean hasNext() {
    if (index < list.size() - 1) {
      return true;
    }
    return false;
  }
}

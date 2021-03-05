package patterns.behavioral.iterator.demo.baseFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

  private List<T> list = new ArrayList<>();

  @Override
  public void add(T t) {
    list.add(t);
  }

  @Override
  public void remove(T t) {
    list.remove(t);
  }

  @Override
  public Iterator<T> getIterator() {
    return new ConcreteIterator<T>(list);
  }
}

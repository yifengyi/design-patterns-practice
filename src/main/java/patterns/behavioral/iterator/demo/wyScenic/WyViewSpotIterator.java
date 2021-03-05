package patterns.behavioral.iterator.demo.wyScenic;

import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class WyViewSpotIterator implements ViewSpotIterator {

  private List<WyViewSpot> list = null;

  private int index = -1;

  private WyViewSpot spot;

  public WyViewSpotIterator(List<WyViewSpot> list) {
    this.list = list;
  }

  @Override
  public WyViewSpot first() {
    index = 0;
    return list.get(index);
  }

  @Override
  public boolean hasNext() {
    if (list.size() - 1 > index) {
      return true;
    }
    return false;
  }

  @Override
  public WyViewSpot next() {
    if (hasNext()) {
      spot = list.get(++index);
    }
    return spot;
  }

  @Override
  public WyViewSpot previous() {
    if (index == 0) {
      spot = first();
    }
    if (0 < index) {
      spot = list.get(--index);
    }
    return spot;
  }

  @Override
  public WyViewSpot last() {
    index = list.size() - 1;
    spot = list.get(index);
    return spot;
  }
}

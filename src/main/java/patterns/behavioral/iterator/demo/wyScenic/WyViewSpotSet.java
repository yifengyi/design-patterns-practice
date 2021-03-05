package patterns.behavioral.iterator.demo.wyScenic;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class WyViewSpotSet implements ViewSpotSet {
  private List<WyViewSpot> list = new ArrayList<>();

  @Override
  public void add(WyViewSpot spot) {
    list.add(spot);
  }

  @Override
  public void remove(WyViewSpot spot) {
    list.remove(spot);
  }

  @Override
  public WyViewSpotIterator getIterator() {
    return new WyViewSpotIterator(list);
  }
}

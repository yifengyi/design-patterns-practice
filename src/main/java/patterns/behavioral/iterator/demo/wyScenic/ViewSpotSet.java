package patterns.behavioral.iterator.demo.wyScenic;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public interface ViewSpotSet {
  void add(WyViewSpot spot);

  void remove(WyViewSpot spot);

  ViewSpotIterator getIterator();
}

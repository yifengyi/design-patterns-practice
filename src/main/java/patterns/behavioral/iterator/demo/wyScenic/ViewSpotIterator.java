package patterns.behavioral.iterator.demo.wyScenic;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public interface ViewSpotIterator {
  WyViewSpot first();

  boolean hasNext();

  WyViewSpot next();

  WyViewSpot previous();

  WyViewSpot last();
}

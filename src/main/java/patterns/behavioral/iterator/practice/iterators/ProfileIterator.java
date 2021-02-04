package patterns.behavioral.iterator.practice.iterators;

import patterns.behavioral.iterator.practice.profile.Profile;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}

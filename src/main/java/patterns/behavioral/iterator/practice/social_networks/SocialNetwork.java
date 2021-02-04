package patterns.behavioral.iterator.practice.social_networks;

import patterns.behavioral.iterator.practice.iterators.ProfileIterator;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);

  ProfileIterator createCoworkersIterator(String profileEmail);
}

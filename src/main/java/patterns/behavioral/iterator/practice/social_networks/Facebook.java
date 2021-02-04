package patterns.behavioral.iterator.practice.social_networks;

import patterns.behavioral.iterator.practice.iterators.FacebookIterator;
import patterns.behavioral.iterator.practice.iterators.ProfileIterator;
import patterns.behavioral.iterator.practice.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Facebook implements SocialNetwork {
  private List<Profile> profiles;

  public Facebook(List<Profile> cache) {
    if (cache != null) {
      this.profiles = cache;
    } else {
      this.profiles = new ArrayList<>();
    }
  }

  public Profile requestProfileFromFacebook(String profileEmail) {
    // Here would be a POST request to one of the Facebook API endpoints.
    // Instead, we emulates long network connection, which you would expect
    // in the real life...
    simulateNetworkLatency();
    System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

    // ...and return test data.
    return findProfile(profileEmail);
  }

  public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
    // Here would be a POST request to one of the Facebook API endpoints.
    // Instead, we emulates long network connection, which you would expect
    // in the real life...
    simulateNetworkLatency();
    System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

    // ...and return test data.
    Profile profile = findProfile(profileEmail);
    if (profile != null) {
      return profile.getContacts(contactType);
    }
    return null;
  }

  private Profile findProfile(String profileEmail) {
    for (Profile profile : profiles) {
      if (profile.getEmail().equals(profileEmail)) {
        return profile;
      }
    }
    return null;
  }

  private void simulateNetworkLatency() {
    try {
      Thread.sleep(2500);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public ProfileIterator createFriendsIterator(String profileEmail) {
    return new FacebookIterator(this, "friends", profileEmail);
  }

  @Override
  public ProfileIterator createCoworkersIterator(String profileEmail) {
    return new FacebookIterator(this, "coworkers", profileEmail);
  }
}
package patterns.structural.proxy.practice.some_cool_media_library;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class Video {
  public String id;
  public String title;
  public String data;

  Video(String id, String title) {
    this.id = id;
    this.title = title;
    this.data = "Random video.";
  }
}

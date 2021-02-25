package patterns.structural.proxy.practice.downloader;

import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeLib;
import patterns.structural.proxy.practice.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * // 之前直接与服务对象交互的 GUI 类不需要改变，前提是它仅通过接口与服务对
 * // 象交互。我们可以安全地传递一个代理对象来代替真实服务对象，因为它们都实
 * // 现了相同的接口。
 * 1.0v created by wujf on 2021-2-3
 */
public class YouTubeDownloader {
  private ThirdPartyYouTubeLib api;

  public YouTubeDownloader(ThirdPartyYouTubeLib api) {
    this.api = api;
  }

  public void renderVideoPage(String videoId) {
    Video video = api.getVideo(videoId);
    System.out.println("\n-------------------------------");
    System.out.println("Video page (imagine fancy HTML)");
    System.out.println("ID: " + video.id);
    System.out.println("Title: " + video.title);
    System.out.println("Video: " + video.data);
    System.out.println("-------------------------------\n");
  }

  public void renderPopularVideos() {
    HashMap<String, Video> list = api.popularVideos();
    System.out.println("\n-------------------------------");
    System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
    for (Video video : list.values()) {
      System.out.println("ID: " + video.id + " / Title: " + video.title);
    }
    System.out.println("-------------------------------\n");
  }
}

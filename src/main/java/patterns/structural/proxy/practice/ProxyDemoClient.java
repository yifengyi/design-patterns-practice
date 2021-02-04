package patterns.structural.proxy.practice;


import patterns.structural.proxy.practice.downloader.YouTubeDownloader;
import patterns.structural.proxy.practice.proxy.YouTubeCacheProxy;
import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeClass;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class ProxyDemoClient {
  private static long test(YouTubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    // User behavior in our app:
    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }

  public static void main(String[] args) {
    YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
    YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
  }
}

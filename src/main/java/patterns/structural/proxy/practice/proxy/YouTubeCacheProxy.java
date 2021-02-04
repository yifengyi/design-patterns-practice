package patterns.structural.proxy.practice.proxy;

import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeClass;
import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeLib;
import patterns.structural.proxy.practice.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
  private ThirdPartyYouTubeLib   youTubeService;
  private HashMap<String,Video>  cachePopular =new HashMap<>();
  private HashMap<String, Video> cacheAll     = new HashMap<>();

  public YouTubeCacheProxy() {
    this.youTubeService =new ThirdPartyYouTubeClass();
  }

  @Override
  public HashMap<String, Video> popularVideos() {
    if (cachePopular.isEmpty()) {
      cachePopular = youTubeService.popularVideos();
    }else{
      System.out.println("Retrieved list from cache.");
    }
    return cachePopular;
  }

  @Override
  public Video getVideo(String videoId) {
    Video video = cacheAll.get(videoId);
    if (video == null) {
      video = youTubeService.getVideo(videoId);
      cacheAll.put(videoId, video);
    } else {
      System.out.println("Retrieved video '" + videoId + "' from cache.");
    }
    return video;
  }
  public void reset(){
    cacheAll.clear();
    cachePopular.clear();
  }
}

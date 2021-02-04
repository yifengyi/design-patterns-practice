package patterns.structural.proxy.practice.some_cool_media_library;

import java.util.HashMap;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface ThirdPartyYouTubeLib {
  HashMap<String, Video> popularVideos();

  Video getVideo(String videoId);

}

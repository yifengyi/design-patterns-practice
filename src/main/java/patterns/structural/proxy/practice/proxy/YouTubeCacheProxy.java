package patterns.structural.proxy.practice.proxy;

import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeClass;
import patterns.structural.proxy.practice.some_cool_media_library.ThirdPartyYouTubeLib;
import patterns.structural.proxy.practice.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * // 为了节省网络带宽，我们可以将请求结果缓存下来并保存一段时间。但你可能无
 * // 法直接将这些代码放入服务类中。比如该类可能是第三方程序库的一部分或其签
 * // 名是`final（最终）`。因此我们会在一个实现了服务类接口的新代理类中放入
 * // 缓存代码。当代理类接收到真实请求后，才会将其委派给服务对象。
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

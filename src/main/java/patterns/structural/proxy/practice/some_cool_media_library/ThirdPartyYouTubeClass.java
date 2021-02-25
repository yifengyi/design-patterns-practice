package patterns.structural.proxy.practice.some_cool_media_library;

import java.util.HashMap;

/**
 * // 服务连接器的具体实现。该类的方法可以向YouTube请求信息。请求速度取决于
 * // 用户和YouTube的互联网连接情况。如果同时发送大量请求，即使所请求的信息
 * // 一模一样，程序的速度依然会减慢。
 * 1.0v created by wujf on 2021-2-3
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
  @Override
  public HashMap<String, Video> popularVideos() {
    connectToServer("http://www.youtube.com");
    return getRandomVideos();
  }

  @Override
  public Video getVideo(String videoId) {
    connectToServer("http://www.youtube.com");
    return getSomeVideo(videoId);
  }
  private int random(int min,int max){
    return min + (int) (Math.random() * ((max - min) + 1));
  }
  private void experienceNetworkLatency(){
    int randomLatency = random(5, 10);
    for (int i = 0; i < randomLatency; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void connectToServer(String server){
    System.out.print("Connecting to " + server + "...");
    experienceNetworkLatency();
    System.out.print("Connected!" + '\n');
  }
  private HashMap<String,Video> getRandomVideos(){
    System.out.println("Downloading populars...");
    experienceNetworkLatency();
    HashMap<String, Video> hmap = new HashMap<>();
    hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
    hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
    hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
    hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
    hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

    System.out.print("Done!" + "\n");
    return hmap;
  }

  private Video getSomeVideo(String videoId){
    System.out.print("Downloading video... ");

    experienceNetworkLatency();
    Video video = new Video(videoId, "Some video title");

    System.out.print("Done!" + "\n");
    return video;
  }
}

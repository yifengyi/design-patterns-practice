package patterns.structural.facade.practice;

import patterns.structural.facade.practice.facade.VideoConversionFacade;

import java.io.File;

/**
 * // 应用程序的类并不依赖于复杂框架中成千上万的类。同样，如果你决定更换框架，
 * // 那只需重写外观类即可。
 * 1.0v created by wujf on 2021-2-3
 */
public class FacadeDemoClient {
  public static void main(String[] args) {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

  }
}

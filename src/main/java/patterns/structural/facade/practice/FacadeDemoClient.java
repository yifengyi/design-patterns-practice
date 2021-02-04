package patterns.structural.facade.practice;

import patterns.structural.facade.practice.facade.VideoConversionFacade;

import java.io.File;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class FacadeDemoClient {
  public static void main(String[] args) {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

  }
}

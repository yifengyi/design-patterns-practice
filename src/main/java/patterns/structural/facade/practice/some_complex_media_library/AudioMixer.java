package patterns.structural.facade.practice.some_complex_media_library;

import java.io.File;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class AudioMixer {
  public File fix(VideoFile file){
    System.out.println("AudioMixer: fixing audio...");
    return new File("tmp");
  }
}

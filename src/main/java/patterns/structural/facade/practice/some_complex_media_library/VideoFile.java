package patterns.structural.facade.practice.some_complex_media_library;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class VideoFile {
  private String name;
  private String codecType;

  public VideoFile(String name) {
    this.name = name;
    this.codecType = name.substring(name.indexOf("." )+ 1);
  }

  public String getName() {
    return name;
  }

  public String getCodecType() {
    return codecType;
  }
}

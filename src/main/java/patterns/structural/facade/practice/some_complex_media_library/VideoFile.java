package patterns.structural.facade.practice.some_complex_media_library;

/**
 * // 这里有复杂第三方视频转换框架中的一些类。我们不知晓其中的代码，因此无法
 * // 对其进行简化。
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

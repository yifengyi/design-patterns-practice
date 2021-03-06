package patterns.structural.facade.practice.facade;

import patterns.structural.facade.practice.some_complex_media_library.*;

import java.io.File;

/**
 * // 为了将框架的复杂性隐藏在一个简单接口背后，我们创建了一个外观类。它是在
 * // 功能性和简洁性之间做出的权衡。
 * 1.0v created by wujf on 2021-2-3
 */
public class VideoConversionFacade {
  public File convertVideo(String fileName,String format){
    System.out.println("VideoConversionFacade: conversion started.");
    VideoFile file = new VideoFile(fileName);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;
    if (format.equals("mp4")) {
      destinationCodec = new OggCompressionCodec();
    } else {
      destinationCodec = new MPEG4CompressionCodec();
    }
    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    File result = (new AudioMixer()).fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed.");
    return result;
  }
}

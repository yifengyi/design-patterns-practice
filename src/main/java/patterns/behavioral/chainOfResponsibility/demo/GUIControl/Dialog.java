package patterns.behavioral.chainOfResponsibility.demo.GUIControl;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class Dialog extends Container {
  private String wikiPageUrl;

  public Dialog(String title) {
    super.tooltipText =title;
  }

  public void setWikiPageUrl(String wikiPageUrl) {
    this.wikiPageUrl = wikiPageUrl;
  }

  @Override
  public void showHelp() {
    if (Objects.nonNull(wikiPageUrl)) {
      System.out.println("open:"+wikiPageUrl);
    }else{
      super.showHelp();
    }
  }
}

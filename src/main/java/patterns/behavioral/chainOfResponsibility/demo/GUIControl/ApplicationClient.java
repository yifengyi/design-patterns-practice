package patterns.behavioral.chainOfResponsibility.demo.GUIControl;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class ApplicationClient {
  private static Container createUI(){
    Dialog dialog = new Dialog("预算报告");
    dialog.setWikiPageUrl("http://www.baidu.com");
    Panel panel = new Panel("面板");
    panel.setModelHelpText("本面板用于...");
    Button ok = new Button("确定");
    Button cancel = new Button("撤销");

    panel.add(ok);
    panel.add(cancel);
    dialog.add(panel);
    // ok.container.showHelp();
    // panel.container.showHelp();
    return dialog;

  }
  public static void main(String[] args) {
    Container container = createUI();

    container.showHelp();

  }
}

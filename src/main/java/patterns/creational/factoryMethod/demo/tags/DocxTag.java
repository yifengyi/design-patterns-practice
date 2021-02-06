package patterns.creational.factoryMethod.demo.tags;

/**
 * V1.0 created by wujf  on  2021-02-06
 */
public class DocxTag implements Tag{
    @Override
    public void render() {
        System.out.println("这是 docx 解压后的document.xml 文件元素");
    }

    @Override
    public void onClick() {
        System.out.println("docx 没有点击事件");
    }
}

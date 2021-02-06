package patterns.creational.factoryMethod.demo.tags;

/**
 * V1.0 created by wujf  on  2021-02-06
 */
public class HTMLTag implements Tag {
    @Override
    public void render() {
        System.out.println("这是html标签");
    }

    @Override
    public void onClick() {
        System.out.println("绑定点击事件");
    }
}

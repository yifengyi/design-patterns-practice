package patterns.creational.factoryMethod.demo.factory;

import patterns.creational.factoryMethod.demo.tags.Tag;

/**
 * V1.0 created by wujf  on  2021-02-06
 */
public abstract class DocumentFactory {
    public abstract Tag createTag();

    public void renderDocument(){
        Tag tag = createTag();
        tag.render();
        tag.onClick();
    }
}

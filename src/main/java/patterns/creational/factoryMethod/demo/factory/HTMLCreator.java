package patterns.creational.factoryMethod.demo.factory;

import patterns.creational.factoryMethod.demo.tags.HTMLTag;
import patterns.creational.factoryMethod.demo.tags.Tag;

/**
 * V1.0 created by wujf  on  2021-02-06
 */
public class HTMLCreator extends DocumentFactory {
    @Override
    public Tag createTag( ) {
        return  new HTMLTag();
    }
}

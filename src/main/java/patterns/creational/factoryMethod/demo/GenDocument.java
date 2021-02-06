package patterns.creational.factoryMethod.demo;


import patterns.creational.factoryMethod.demo.factory.DocumentFactory;
import patterns.creational.factoryMethod.demo.factory.DocxCreator;
import patterns.creational.factoryMethod.demo.factory.HTMLCreator;

/**
 * V1.0 created by wujf  on  2021-02-06
 */
public class GenDocument {
    public static DocumentFactory genDocument(String type) {
        switch (type) {
            case "HTML":
                return new HTMLCreator();
            case "DOCX":
                return new DocxCreator();
            default:
                throw new RuntimeException("未知的类型");
        }
    }

    public static void main(String[] args) {
        DocumentFactory doc = genDocument("HTML");
        doc.renderDocument();
        System.out.println("-----");
        DocumentFactory doc2 = genDocument("DOCX");
        doc2.renderDocument();
    }
}

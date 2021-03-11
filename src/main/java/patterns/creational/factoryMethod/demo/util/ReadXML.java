package patterns.creational.factoryMethod.demo.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * 1.0v created by wujf on 2021-3-11
 */
public class ReadXML {
  public static Object getObject(String path){
    Object obj = null;
    try {
      DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
      DocumentBuilder builder =factory.newDocumentBuilder();
      Document doc = builder.parse(ReadXML.class.getClassLoader().getResourceAsStream(path));

      NodeList list = doc.getElementsByTagName("className");
      Node node = list.item(0).getFirstChild();
      String classname = node.getNodeValue();
      Class<?> c = Class.forName(classname);
      obj = c.newInstance();
    } catch (ParserConfigurationException | SAXException | IOException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    return obj;
  }
}

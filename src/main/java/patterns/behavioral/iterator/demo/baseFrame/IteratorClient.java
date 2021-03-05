package patterns.behavioral.iterator.demo.baseFrame;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class IteratorClient {
  public static void main(String[] args) {
    Aggregate<String> ag = new ConcreteAggregate<String> ();
    ag.add("中山大学");
    ag.add("华南理工");
    ag.add("韶关学院");
    System.out.print("聚合的内容有：");
    Iterator<String> it = ag.getIterator();
    while (it.hasNext()) {
      String ob = it.next();
      System.out.print(ob + "\t");
    }
    String ob = it.first();
    System.out.println("\nFirst：" + ob);
  }
}

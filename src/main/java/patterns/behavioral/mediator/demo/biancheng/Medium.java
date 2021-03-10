package patterns.behavioral.mediator.demo.biancheng;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public interface Medium {
  void register(Customer customer);

  void relay(String from, String ad);
}

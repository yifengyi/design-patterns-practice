package patterns.behavioral.mediator.demo.biancheng;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public class EstateMedium implements Medium {

  private List<Customer> customers = new ArrayList<>();

  @Override
  public void register(Customer customer) {
    if (!customers.contains(customer)) {
      customers.add(customer);
      customer.setMedium(this);
    }
  }

  @Override
  public void relay(String from, String ad) {
    for (Customer customer : customers) {
      String name = customer.getName();
      if (!name.equals(from)) {
        customer.receive(from, ad);
      }
    }
  }
}

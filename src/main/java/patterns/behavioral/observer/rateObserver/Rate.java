package patterns.behavioral.observer.rateObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-3-9
 */
public abstract class Rate {
  protected List<Company> companies = new ArrayList<>();

  public void add(Company company){
    companies.add(company);
  }

  public void remove(Company company){
    companies.remove(company);
  }

  public abstract void change(int number);
}

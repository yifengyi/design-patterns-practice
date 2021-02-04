package patterns.behavioral.mediator.practice.components;

import patterns.behavioral.mediator.practice.mediator.Mediator;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface Component {
  void setMediator(Mediator mediator);

  String getName();
}

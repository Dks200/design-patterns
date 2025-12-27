package patterns.starategy.behavior.quack.impl;

import patterns.starategy.behavior.quack.QuackBehavior;

public class MuteDuck implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Can't quack");
  }

}

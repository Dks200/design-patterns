package patterns.starategy.behavior.quack.impl;

import patterns.starategy.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Duck quacking");
  }

}

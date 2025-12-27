package patterns.starategy.behavior.quack.impl;

import patterns.starategy.behavior.quack.QuackBehavior;

public class Squak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Rubber duck squack");
  }

}

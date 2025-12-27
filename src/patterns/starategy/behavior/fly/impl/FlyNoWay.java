package patterns.starategy.behavior.fly.impl;

import patterns.starategy.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Can't fly");
  }

}

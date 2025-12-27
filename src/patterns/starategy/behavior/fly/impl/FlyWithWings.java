package patterns.starategy.behavior.fly.impl;

import patterns.starategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly with wings");
  }

}

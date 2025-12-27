package patterns.starategy.objects.impl;

import patterns.starategy.behavior.fly.FlyBehavior;
import patterns.starategy.behavior.quack.QuackBehavior;
import patterns.starategy.objects.Duck;

public class RubberDuck extends Duck {

  public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("I am a rubber duck");
  }

}

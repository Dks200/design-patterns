package patterns.starategy.objects.impl;

import patterns.starategy.behavior.fly.FlyBehavior;
import patterns.starategy.behavior.quack.QuackBehavior;
import patterns.starategy.objects.Duck;

public class MallardDuck extends Duck {

  public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("I am a model duck");
  }

}

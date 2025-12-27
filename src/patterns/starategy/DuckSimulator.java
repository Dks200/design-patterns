package patterns.starategy;

import patterns.starategy.behavior.fly.impl.FlyNoWay;
import patterns.starategy.behavior.fly.impl.FlyWithWings;
import patterns.starategy.behavior.quack.impl.MuteDuck;
import patterns.starategy.behavior.quack.impl.Quack;
import patterns.starategy.behavior.quack.impl.Squak;
import patterns.starategy.objects.Duck;
import patterns.starategy.objects.impl.MallardDuck;
import patterns.starategy.objects.impl.RubberDuck;

public class DuckSimulator {

  public static void main(String[] args) {
    Duck duck = new MallardDuck(new FlyWithWings(), new Quack());
    duck.display();
    duck.performQuack();
    duck.performFly();
    duck.swim();
    duck.setQuackBehavior(new MuteDuck());
    duck.performQuack();

    System.out.println("========================");

    Duck duck2 = new RubberDuck(new FlyNoWay(), new Squak());
    duck2.display();
    duck2.performQuack();
    duck2.performFly();
    duck2.swim();
    duck2.setFlyBehavior(new FlyWithWings());
    duck2.performFly();
  }
}

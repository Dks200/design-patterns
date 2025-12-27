package patterns.decorator.decorator.impl;

import patterns.decorator.decorator.ToppingDecorator;
import patterns.decorator.objects.BasePizza;

public class MushroomToppingDecorator extends ToppingDecorator {

  public MushroomToppingDecorator(BasePizza basePizza) {
    super(basePizza);
  }

  @Override
  public String getDescription() {
    return this.basePizza.getDescription() + " with Mushroom";
  }

  @Override
  public double getPrice() {
    return this.basePizza.getPrice() + 20;
  }
}

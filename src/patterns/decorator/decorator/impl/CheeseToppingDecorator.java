package patterns.decorator.decorator.impl;

import patterns.decorator.decorator.ToppingDecorator;
import patterns.decorator.objects.BasePizza;

public class CheeseToppingDecorator extends ToppingDecorator {

  public CheeseToppingDecorator(BasePizza basePizza) {
    super(basePizza);
  }

  @Override
  public String getDescription() {
    return this.basePizza.getDescription() + " with Cheese";
  }

  @Override
  public double getPrice() {
    return this.basePizza.getPrice() + 10;
  }
}

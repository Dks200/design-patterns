package patterns.decorator.objects.impl;

import patterns.decorator.objects.BasePizza;

public class VegDelightPizza implements BasePizza {
  @Override
  public String getDescription() {
    return "Veg Delight Pizza";
  }

  @Override
  public double getPrice() {
    return 150;
  }
}

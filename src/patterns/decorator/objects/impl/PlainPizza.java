package patterns.decorator.objects.impl;

import patterns.decorator.objects.BasePizza;

public class PlainPizza implements BasePizza {

  @Override
  public String getDescription() {
    return "Plain Pizza";
  }

  @Override
  public double getPrice() {
    return 100;
  }
}

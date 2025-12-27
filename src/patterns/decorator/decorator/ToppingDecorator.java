package patterns.decorator.decorator;

import patterns.decorator.objects.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
  protected BasePizza basePizza;

  public ToppingDecorator(BasePizza basePizza) {
    this.basePizza = basePizza;
  }
}

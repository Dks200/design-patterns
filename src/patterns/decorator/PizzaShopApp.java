package patterns.decorator;

import patterns.decorator.decorator.impl.CheeseToppingDecorator;
import patterns.decorator.decorator.impl.MushroomToppingDecorator;
import patterns.decorator.objects.BasePizza;
import patterns.decorator.objects.impl.PlainPizza;
import patterns.decorator.objects.impl.VegDelightPizza;

public class PizzaShopApp {

  public static void main(String[] args) {
    BasePizza plainPizza = new PlainPizza();
    BasePizza mushroomPizza = new MushroomToppingDecorator(plainPizza);

    System.out.println(mushroomPizza.getDescription());
    System.out.println(mushroomPizza.getPrice());

    BasePizza vegDelightWithCheeseAndMushroom = new MushroomToppingDecorator(new CheeseToppingDecorator(new VegDelightPizza()));
    System.out.println(vegDelightWithCheeseAndMushroom.getDescription());
    System.out.println(vegDelightWithCheeseAndMushroom.getPrice());
  }
}

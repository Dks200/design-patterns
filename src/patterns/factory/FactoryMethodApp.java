package patterns.factory;

import patterns.factory.factorymethod.ShapeFactory;
import patterns.factory.factorymethod.impl.CircleFactory;
import patterns.factory.factorymethod.impl.SquareFactory;
import patterns.factory.product.Shape;

public class FactoryMethodApp {
  public static void main(String[] args) {
    System.out.println("Factory Method Application");
    System.out.println("==========================");

    ShapeFactory circleFactory = new CircleFactory();
    Shape circle = circleFactory.createShape();
    circle.computeArea();
    circle.draw();
    System.out.println("==========================");

    ShapeFactory squareFactory = new SquareFactory();
    Shape square = squareFactory.createShape();
    square.computeArea();
    square.draw();
    System.out.println("==========================");
  }
}

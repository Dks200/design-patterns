package patterns.factory;

import patterns.factory.product.Shape;
import patterns.factory.simple.ShapeType;
import patterns.factory.simple.SimpleShapeFactory;

public class SimpleFactoryApp {

  public static void main(String[] args) {
    System.out.println("Simple Factory Application");
    System.out.println("==========================");
    Shape circle = SimpleShapeFactory.createShapeInstance(ShapeType.CIRCLE);
    circle.computeArea();
    circle.draw();
    System.out.println("==========================");

    Shape square = SimpleShapeFactory.createShapeInstance(ShapeType.SQUARE);
    square.computeArea();
    square.draw();
    System.out.println("==========================");
  }
}

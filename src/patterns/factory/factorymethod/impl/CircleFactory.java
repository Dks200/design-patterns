package patterns.factory.factorymethod.impl;

import patterns.factory.factorymethod.ShapeFactory;
import patterns.factory.product.Shape;
import patterns.factory.product.impl.Circle;

public class CircleFactory implements ShapeFactory {
  @Override
  public Shape createShape() {
    return new Circle();
  }
}

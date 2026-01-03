package patterns.factory.simple;

import patterns.factory.product.Shape;
import patterns.factory.product.impl.Circle;
import patterns.factory.product.impl.Square;


public class SimpleShapeFactory {
  public static Shape createShapeInstance(ShapeType shapeType) {
    if (shapeType == null) {
      return null;
    }
    return switch (shapeType) {
      case CIRCLE -> new Circle();
      case SQUARE -> new Square();
      default -> throw new IllegalStateException("ShapeType doesn't exist!");
    };
  }
}

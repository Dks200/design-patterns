package patterns.factory.product.impl;

import patterns.factory.product.Shape;

public class Circle implements Shape {
  @Override
  public void computeArea() {
    System.out.println("Compute circle area");
  }

  @Override
  public void draw() {
    System.out.println("Draw a circle");
  }
}

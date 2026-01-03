package patterns.factory.product.impl;

import patterns.factory.product.Shape;

public class Square implements Shape {
  @Override
  public void computeArea() {
    System.out.println("Compute square area");
  }

  @Override
  public void draw() {
    System.out.println("Draw a square");
  }
}

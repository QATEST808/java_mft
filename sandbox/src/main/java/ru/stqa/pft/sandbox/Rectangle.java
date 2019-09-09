package ru.stqa.pft.sandbox;

import javax.print.attribute.standard.RequestingUserName;

public class Rectangle {

  public double a;
  public double b;

  public Rectangle (double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}

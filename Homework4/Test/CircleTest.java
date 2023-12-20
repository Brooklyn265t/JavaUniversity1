package Mirea.Homework4.Test;


import Mirea.Homework4.Class.Circle;


public class CircleTest {
  public CircleTest() {
    Circle circle = new Circle(5);
    System.out.println("Radius: " + circle.getRadius());
    System.out.println("Perimeter: " + circle.calculatePerimeter());
    System.out.println("Area: " + circle.calculateArea());

    circle.setRadius(10);
    System.out.println("Updated Radius: " + circle.getRadius());
    System.out.println("Updated Perimeter: " + circle.calculatePerimeter());
    System.out.println("Updated Area: " + circle.calculateArea());
  }
}
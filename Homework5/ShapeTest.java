package Mirea.Homework5;

import java.lang.*;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version? 
        System.out.println(s1.getArea()); // which version? 
        System.out.println(s1.Perimetr()); // which version? 
        System.out.println(s1.getColor());  
        System.out.println(s1.isFilled());  
        //System.out.println(s1.getRadius()); // 
        
        Circle c1 = (Circle)s1; // downcast back to Circle 
        System.out.println(c1);  
        System.out.println(c1.getArea());  
        System.out.println(c1.Perimetr());  
        System.out.println(c1.getColor());  
        System.out.println(c1.isFilled());  
        System.out.println(c1.getRadius()); 

        //Shape s2 = new Shape();
        //не могу использовать конструкторы в абстракном классе

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast 
        // приводим shape к прямоугольнику
        System.out.println(s3);  
        System.out.println(s3.getArea());  
        System.out.println(s3.Perimetr());  
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        //getlength не определён в классе Shape
        
        Rectangle r1 = (Rectangle)s3; // downcast
        // прямоугольник приводиться к прямоугольнику
        
        System.out.println(r1);  
        System.out.println(r1.getArea());  
        System.out.println(r1.getColor());  
        System.out.println(r1.getLength()); 

        Shape s4 = new Square(6.6); // Upcast  приводим shape к квадрату
        System.out.println(s4);  
        System.out.println(s4.getArea());  
        System.out.println(s4.getColor());  
        //System.out.println(s4.getSide()); //нету метода

        // Take note that we downcast Shape s4 to Rectangle,  
        // which is a superclass of Square, instead of Square  
        Rectangle r2 = (Rectangle)s4; //приводим квадрат к прямоугольнику
        System.out.println(r2);  
        System.out.println(r2.getArea());  
        System.out.println(r2.getColor());  
        //System.out.println(r2.getSide());  //нету метода
        System.out.println(r2.getLength()); 

        // Downcast Rectangle r2 to Square  
        Square sq1 = (Square)r2;  
        System.out.println(sq1);  
        System.out.println(sq1.getArea());  
        System.out.println(sq1.getColor());  
        System.out.println(sq1.getSide());  
        System.out.println(sq1.getLength()); 
    }
    
}

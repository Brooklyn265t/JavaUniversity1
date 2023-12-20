package Mirea.Homework5;
import static java.lang.Math.*;

public class Circle extends Shape{
        protected double radius;
        public Circle(){}
        public Circle(double radius,String color, boolean filled){}
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        @Override
        public double getArea(){
            return radius * radius * Math.PI;
        }
        @Override
        public  double Perimetr(){
            return 2 * Math.PI *radius;
        }
        @Override
        public String toString(){
            return this.color+ ", "+this.filled;
        }
    }   
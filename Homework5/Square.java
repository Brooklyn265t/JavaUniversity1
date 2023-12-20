package Mirea.Homework5;

public class Square extends Rectangle{
        public Square(){}
        public Square(double side){}
        public Square(double side,String color, boolean filled){}
        public double getSide(){
            return length;
        }
        public void setSide(double side){
            this.length = side;
        }
        public double getLength(){
            return length;
        }
        public void setLength(double length){
            this.length= length;
        }
        
        public double getArea(){
            return length* length;
        }
        public double Perimetr(){
            return 4 * length;
        }
        @Override
        public  String toString(){
            return this.length+ ", "+this.length;
        }
    }

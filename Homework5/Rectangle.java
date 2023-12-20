package Mirea.Homework5;

    public class Rectangle extends Shape{
        protected double width;
        protected double length;
        public Rectangle(){}
        public Rectangle(double width, double length){}
        public Rectangle(double width, double length, String color, boolean filled){}
        public double getWidth(){
            return width;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public double getLength(){
            return length;
        }
        public void setLength(double length){
            this.length= length;
        }
        @Override
        public double getArea(){
            return width * length;
        }
        @Override
        public double Perimetr(){
            return 2*(width+length);
        }
        @Override
        public String toString(){
            return this.width+", "+this.length;
        }
    }
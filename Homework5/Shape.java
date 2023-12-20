package Mirea.Homework5;


public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(){}
    
    public Shape(String color,boolean filled){}
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){}
    
    public abstract double getArea();
    
    public abstract double Perimetr();
    
    public String toString(){
        return this.color + ", " + this.filled;
    }
}
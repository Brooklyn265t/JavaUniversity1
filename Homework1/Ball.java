package Mirea.Homework1;

import java.lang.*;

public class Ball {
    private int x;
    private int y;
    private double r;
    private String colour; 
    private int weight;
    public Ball(int xc, int yc, double rs, String colours){ 
        x = xc;
        y = yc;
        r = rs;
        colour = colours;
    }
    public Ball(double rs, String colours, int weights){
        r = rs;
        colour = colours;
        weight = weights;
    } 
    public Ball(String colours){ 
        colour = colours;
    } 
    public void setX(int x) { 
        this.x = x; 
    }
    public void setY(int y) { 
        this.y = y; 
    }
    public void setR(int r) { 
        this.r = r; 
    }
    public void setColour(String colour) { 
        this.colour = colour; 
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public double getX(){ 
        return x; 
    }
    public int getY() { 
        return y; 
    }
    public double getR() { 
        return r; 
    }
    public String getColour() {
        return colour;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){ 
    return ", coordinate " + this.x + ", coordinate "+ this.y + "radius "+ this.r + "colour " + this.colour + "weight " + this.weight; 
    } 
    public void Balls(){ 
    System.out.println("coordinate x "+ x + "  ,y, " + y + " radius balls " + r + " colour balls " + colour + " weight balls " + weight); 
    } 
    
}
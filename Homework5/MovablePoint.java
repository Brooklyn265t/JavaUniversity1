package Mirea.Homework5;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    
    public MovablePoint(int x, int xSpeed, int y, int ySpeed){  
    }
    @Override
    public void moveUp(){
        y += ySpeed;
    }
    @Override
    public void moveDown(){
        y -= ySpeed;
    }
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    public boolean Samespeed(MovablePoint otherPoint){
        return xSpeed == otherPoint.xSpeed && ySpeed == otherPoint.ySpeed;
    }
    public String toString(){
    return this.x + ", " + this.y+ ", " + this.xSpeed+ ", " + this.ySpeed;
    }
}
package Mirea.Homework5;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;
    
    public MovableCircle (int x, int xSpeed, int y, int ySpeed){
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
    public String toString(){
        return this.radius+", "+this.center; 
    }
}

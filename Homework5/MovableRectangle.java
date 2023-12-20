package Mirea.Homework5;

public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        
    }
    @Override
    public void moveUp(){
        topleft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topleft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft(){
        topleft.moveLeft();
        bottomRight.moveUp();
    }
    @Override
    public void moveRight(){
        topleft.moveRight();
        bottomRight.moveRight();
    }
    public boolean Samespeed(){
        return topleft.Samespeed(bottomRight);
    }
    public void SpeedTestUP(){}
    public String toString(){
        return this.topleft+", "+this.bottomRight; 
    }
}
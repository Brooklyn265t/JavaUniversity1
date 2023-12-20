package Mirea.Homework1;

import java.lang.*;

public class BallTest {
    public static void main(String[] args) {
    Ball version1 = new Ball(3, 4, 5.03, "Blue"); 
    Ball version2 = new Ball(14.73,"Red", 700); 
    Ball version3 = new Ball("Green"); version3.setWeight(400); 
    System.out.println(version1); 
    version1.Balls(); 
    version2.Balls(); 
    version3.Balls(); 
    }
}

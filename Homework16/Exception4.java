package Mirea.Homework16;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }
}

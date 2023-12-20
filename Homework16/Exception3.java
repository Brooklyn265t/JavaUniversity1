package Mirea.Homework16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (InputMismatchException e) {
            System.out.println("Input is not an integer");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid number");
        }
    }
}

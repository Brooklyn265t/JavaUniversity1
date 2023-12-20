package Mirea.Homework10;

import java.util.Scanner;

public class RecursionTriangle {
    public static String Recursion(int n){
        int count = 1;
        int printCount = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(count + " ");
            printCount++;
            
            if (printCount == count) {
                count++;
                printCount = 0;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        int n;
        Scanner scanne = new Scanner(System.in);
        n = scanne.nextInt();
        Recursion(n);
    }
}
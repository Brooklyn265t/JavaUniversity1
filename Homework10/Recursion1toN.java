package Mirea.Homework10;

public class Recursion1toN {
    public static String Recursion1toN(int n){
        if (n == 1) {
            return "1";
        }
        return Recursion1toN(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.println(Recursion1toN(10));
    }
}
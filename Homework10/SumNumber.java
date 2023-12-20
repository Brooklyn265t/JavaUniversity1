package Mirea.Homework10;

public class SumNumber {
    public static int sumNumbersNumber(int n){
        if(n < 10){
            return n ;
        }
        else {
            return n % 10 + sumNumbersNumber(n / 10);
        }
    }
    public static void main(String[] args) {
       System.out.println(sumNumbersNumber(123));
    }
}

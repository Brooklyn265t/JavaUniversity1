package Mirea.Homework10;

public class AvsB {
    public static String AvsB(int a, int b){
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + AvsB(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + AvsB(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(AvsB(5,7));
    }
}
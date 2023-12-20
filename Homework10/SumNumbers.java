package Mirea.Homework10;

public class SumNumbers {
    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0); //если len == 0 истино(1), иначе ложно(0)
        int res = 0;
        
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(recursion(0, 0, 3, 15)); // вызов рекурсивной функции
    }
}
package Mirea.Homework2;
 
public class hord {
 
    public static void main(String[] args) {
        double x0 = -4;
        double x1 = -2.012;
        double e = 0.006;
        double x = method_chord(x0, x1, e);
        System.out.println(x);
    }
    
    public static double method_chord (double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do{
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }
    
    public static double f (double x){
        return Math.pow(x, 3) - 11.51 * x - 6;
    }
}
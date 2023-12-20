package Mirea.Homework2;

import java.util.Scanner;

public class Java_homework1_2 {
        public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        int massive[] = new int[10];
        double sum_numbers = 0;
        int count = 0;
        int max_number = 0;
        int min_number = 2550000;
        System.out.println("Введите число");
        while(count < 10){
            massive[count] = scanne.nextInt();
            sum_numbers += massive[count];
            count += 1;
        }
        for (int i = 0;  i < 10; i++){
            if (massive[i] >= max_number) {
                max_number = massive[i];
            }
            if (massive[i] <= min_number) {
                min_number = massive[i];
            }
            else{
                continue;
            }
        }
        System.out.println(sum_numbers);
        System.out.println(max_number);
        System.out.println(min_number);
    }
}
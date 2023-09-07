package ru.mirea.lab1;

import java.util.Scanner;

public class Java_homework1 {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        int massive[] = new int[10];
        double sum_numbers = 0;
        System.out.println("Введите число");
        for (int i = 0;  i < 10; i++){
            massive[i] = scanne.nextInt();
            sum_numbers += massive[i];
        }
        System.out.println(sum_numbers);
        sum_numbers = sum_numbers / 10;
        System.out.println(sum_numbers);
    }
}
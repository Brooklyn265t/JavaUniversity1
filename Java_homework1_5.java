package ru.mirea.lab1;

import java.util.Scanner;

class fact  {
    public long calcFactor(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        else if (number <= 1) {
            return 1;
        }
        else {
            return number * calcFactor(number - 1);
        }
    }
}

public class Java_homework1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // читаем число с клавиатуры
        scanner.close();
        if (number > 20) {
            throw new IllegalArgumentException("Число не должно быть больше 20");
        }
        fact factorial = new fact();
        long result = factorial.calcFactor(number); // вызываем метод calcFactor для вычисления факториала
        System.out.println("Факториал числа " + number + " равен: " + result);
    }
}
package Mirea.Homework11;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        // Создаем массив объектов класса Student
        Student[] students = {
                new Student("ivan", 5),
                new Student("alex", 2),
                new Student("ana", 10),
                new Student("max", 1),
                new Student("gretta", 7)
        };
        for (Student student : students) {
            System.out.println(student.getName() + " | " + student.getIDnumber());
        }
        insertionSort(students);
        System.out.println("Массив отсортирован:");
        // Выводим отсортированный массив
        for (Student student : students) {
            System.out.println(student.getName() + " | " + student.getIDnumber());
        }
    }
    
    
    public static void insertionSort (Student[] students) {
        // Сортируем массив по полю iDNumber с помощью сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDnumber() < key.getIDnumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
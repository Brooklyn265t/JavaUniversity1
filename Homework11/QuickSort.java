package Mirea.Homework11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class QuickSort implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем итоговые баллы студентов в порядке убывания
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }

    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3.8));
        students.add(new Student("Emily", 3.9));
        students.add(new Student("Michael", 3.5));
        students.add(new Student("Sophia", 3.7));
        students.add(new Student("William", 3.6));

        // Создаем экземпляр класса SortingStudentsByGPA
        QuickSort sorter = new QuickSort();

        // Сортируем список студентов по итоговым баллам в порядке убывания
        sorter.quickSort(students, 0, students.size() - 1);

        // Выводим отсортированный список студентов
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}
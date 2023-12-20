package Mirea.Homework11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 64));
        list1.add(new Student("Bob", 34));
        list1.add(new Student("Charlie", 25));
        list1.add(new Student("David", 12));
        list1.add(new Student("Eve", 22));
        list1.add(new Student("Frank", 11));
        list1.add(new Student("Grace", 90));
        int n = list1.size();
        
        System.out.println("Original array:");
        for (Student student : list1) {
            System.out.print(student.getName() + " " + student.getIDnumber() + " | ");
        }
        System.out.println();

        mergeSort(list1, 0, n - 1);

        System.out.println("Sorted array:");
        for (Student student : list1) {
            System.out.print(student.getName() + " " + student.getIDnumber() + " | ");
        }
        System.out.println();
    }
    public static void merge(List<Student> sortlist, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
//       System.out.printf("left=%d, middle=%d, right=%d, n1=%d, n2=%d%n", left, middle, right, n1, n2);

        List<Student> leftArr = new LinkedList<>();
        List<Student> rightArr = new LinkedList<>();

        for (int i = 0; i < n1; ++i) {
            leftArr.add(sortlist.get(left + i));
        }
        for (int j = 0; j < n2; ++j) {
            rightArr.add(sortlist.get(middle + 1 + j));
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr.get(i).getIDnumber() >= rightArr.get(j).getIDnumber()) {
                sortlist.set(k, leftArr.get(i));
                i++;
            } else {
                sortlist.set(k, rightArr.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            sortlist.set(k, leftArr.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            sortlist.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }

    public static void mergeSort(List<Student> create2lists, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(create2lists, left, middle);
            mergeSort(create2lists, middle + 1, right);
            merge(create2lists, left, middle, right);
        }
    }
}
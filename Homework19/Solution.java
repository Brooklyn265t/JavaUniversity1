package Mirea.Homework19;

import java.util.ArrayList;
import java.util.List;

public class Solution { // Код на Java для конвертации массива строк/чисел в список (1)
  public static <T> List<T> arrayToList(T[] array) {
    List<T> list = new ArrayList<>();
    for (T element : array) {
      list.add(element);
    }
    return list;
  }

//  public static void main(String[] args) {
//    String[] stringArray = { "BBB", "BBB" };
//    List<String> stringList = arrayToList(stringArray);
//    System.out.println(stringList);
//
//    Integer[] intArray = { 1, 4, 8 };
//    List<Integer> intList = arrayToList(intArray);
//    System.out.println(intList);
//  }
}

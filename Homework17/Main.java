package Mirea.Homework17;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
   public static void main(String[] args) {
       try {
           List<Student> students = new ArrayList<>();
           students.add(new Student("Иванов Иван Иванович", 4.5));
           students.add(new Student("Петров Петр Петрович", 4.0));
           students.add(new Student("Сидоров Сидор Сидорович", 5.0));

           String fullNameToFind = "";
           StringValidator.validate(fullNameToFind);

           Optional<Student> student = students.stream()
               .filter(s -> s.getFullName().equals(fullNameToFind))
               .findFirst();

           if (student.isPresent()) {
               System.out.println("Студент найден: " + student.get().getFullName());
           } else {
               throw new NoSuchElementException("Студент с таким ФИО не найден");
           }
       } catch (IllegalArgumentException | NoSuchElementException e) {
           System.out.println("Произошла ошибка: " + e.getMessage());
       }
   }
}

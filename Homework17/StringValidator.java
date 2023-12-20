package Mirea.Homework17;

//public class NullString
public class StringValidator {
   public static void validate(String input) {
       if (input == null || input.trim().isEmpty()) {
           throw new IllegalArgumentException("Ввод не может быть пустым или состоять только из пробелов");
       }
   }
}

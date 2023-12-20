package Mirea.Homework18;

public class Dog<T> extends Animal {
   private T toy;

   public Dog(T toy) {
       this.toy = toy;
   }

   public T getToy() {
       return toy;
   }
}
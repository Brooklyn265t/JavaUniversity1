package Mirea.Homework6.Dog;

public class Bulldog extends Dog {
    public Bulldog(int age) {
        super("Bulldog", age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog is barking");
    }
}
package Mirea.Homework9;

public class WorkInterface {
    public static void main(String[] args) {
        Car price = new Car( "Toyota", 125.06);
        price.print();
        System.out.println(((Priceable)price).getPrice());
        System.out.println(((Nameable)price).getName());
        
        Planet namePlanet = new Planet("Jupiter", 1908.1, 6893.0);
        namePlanet.print();
        System.out.println(((Nameable)namePlanet).getName());
        
        Dog namedog = new Dog("Shepard", 17);
        namedog.print();
        System.out.println(((Nameable)namedog).getName());
    }
}

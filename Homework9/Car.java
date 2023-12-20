package Mirea.Homework9;

public class Car implements Priceable, Nameable {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    public void print() { 
        System.out.println("Марка " + name + " Цена= " + price); 
 } 
}

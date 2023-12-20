package Mirea.Homework9;

public class Planet implements Nameable {
    private String name;
    private double weight;
    private double size;

    public Planet(String name, double weight, double size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getSize() {
        return size;
    }
    public void print(String name, double weight, double size) { 
        System.out.printf(name, weight, size); 
    } 

    public void print() {
        System.out.println("Планета " + name + " Вес " + weight + " Размер " + size);
    }
}

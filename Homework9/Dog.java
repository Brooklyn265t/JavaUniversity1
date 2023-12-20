package Mirea.Homework9;


public class Dog implements Nameable {
    private String name;
    private int years;
    
    public Dog(String name, int years) {
        this.name = name;
        this.years = years;
    }
    
    public int getYears(){
        return years;
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
        System.out.println("Имя " + name + " Возраст " + years);
    }
    
}
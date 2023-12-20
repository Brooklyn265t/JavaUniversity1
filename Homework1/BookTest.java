package Mirea.Homework1;

public class BookTest {
    public static void main(String[] args) {
        Book SherlockHolms = new Book(190, "Medium", "Mr. Sherlock Holmes", 400); 
        Book HarryPotter = new Book(250, "Big", 627); 
        Book WolfandSheep = new Book("Small"); WolfandSheep.setWeight(104); 
        System.out.println(WolfandSheep); 
        SherlockHolms.Balls(); 
        HarryPotter.Balls(); 
        WolfandSheep.Balls(); 
    }  
}
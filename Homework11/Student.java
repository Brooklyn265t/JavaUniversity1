package Mirea.Homework11;

public class Student {
    private String name;
    private double GPA;
    private int IDnumber;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }
    public Student(String name, int IDnumber) {
        this.name = name;
        this.IDnumber = IDnumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
    
    public int getIDnumber() {
        return IDnumber;
    }
}

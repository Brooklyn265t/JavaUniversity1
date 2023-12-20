package Mirea.Homework17;

public class Student implements Comparable<Student> {
    private String fullName;
    private double averageScore;

    public Student(String fullName, double averageScore) {
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageScore, other.averageScore);
    }
}
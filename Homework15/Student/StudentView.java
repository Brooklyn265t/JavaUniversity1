package Mirea.Homework15.Student;

public class StudentView {
  private Model student;

  public StudentView(Model student) {
    this.student = student;
  }

  public void update(String roll) {
    student.setRollNo(roll);
  }

  public void printDetails() {
    System.out.println("Student: ");
    System.out.println("Name: " + this.student.getName());
    System.out.println("Roll: " + this.student.getRollNo());
  }
}

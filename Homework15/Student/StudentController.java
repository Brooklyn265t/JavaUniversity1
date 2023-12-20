package Mirea.Homework15.Student;

public class StudentController {
  private Model student;
  private StudentView view;
  private int roll;

  public StudentController(String student, String number) {
    this.student = new Model();
    this.student.setName(student);
    this.student.setRollNo(number);
    view = new StudentView(this.student);
  }

  public StudentView getView() {
    return view;
  }

  public void setView(StudentView view) {
    this.view = view;
  }

  public Model getStudent() {
    return student;
  }

  public void updateName(String name){
    this.student.setName(name);
  }

  public void updateRollNo(String rollNo){
    this.student.setRollNo(rollNo);
  }

  public void updateView() {
    view.printDetails();
  }
}

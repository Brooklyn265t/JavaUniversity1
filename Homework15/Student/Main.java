package Mirea.Homework15.Student;

import Mirea.Homework15.Employee.Employee;

public class Main {
  public static void main(String[] args) {
    var controller = new StudentController("misha", "4");
    controller.updateView();
    controller.updateName("aleks");
    controller.updateView();
    controller.updateRollNo("123");
    controller.updateView();
  }
}
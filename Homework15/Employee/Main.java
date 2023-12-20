package Mirea.Homework15.Employee;

public class Main {
  public static void main(String[] args) {
    Employee model = new Employee("Misha", 100);
    EmployeeView view = new EmployeeView();
    EmployeeController controller = new EmployeeController(model, view);

    controller.updateView();

    controller.setEmployeeSalary(80);

    controller.updateView();
  }
}
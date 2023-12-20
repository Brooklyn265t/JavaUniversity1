package Mirea.Homework18;

public class Main {
  public static void main(String[] args) {
    System.out.println("-- Калькулятор --");

    GenericClass<Integer, Dog, String> genericClass = new GenericClass<>(10, new Dog<>("toy"), "Hello");
    genericClass.printClassNames();

    Integer[] array = { 5, 3, 8, 1, 2 };
    MinMax<Integer> minMax = new MinMax<>(array);
    System.out.println("Миним: " + minMax.findMin());
    System.out.println("Макс: " + minMax.findMax());

    System.out.println("Сумма: " + Calculator.sum(5, 3.5));
    System.out.println("Умножение: " + Calculator.multiply(5, 3.5));
    System.out.println("Деление: " + Calculator.divide(5, 3.5));
    System.out.println("Вычитание: " + Calculator.subtraction(5, 3.5));

    System.out.println("-- Матрица --");
    Integer[][] matrix1 = { { 1, 2 }, { 3, 4 } };
    Integer[][] matrix2 = { { 5, 6 }, { 7, 8 } };

    Matrix<Integer> matrixA = new Matrix<>(matrix1);
    Matrix<Integer> matrixB = new Matrix<>(matrix2);
    System.out.println("Матрица A:");
    for (int i = 0; i < matrixA.getLenght(); i++) {
      for (int j = 0; j < matrixA.getLenght(); j++) {
        System.out.print(matrixA.getElement(i, j) + " ");
      }
      System.out.println();
    }
    System.out.println("Матрица B:");
    for (int i = 0; i < matrixB.getLenght(); i++) {
      for (int j = 0; j < matrixB.getLenght(); j++) {
        System.out.print(matrixB.getElement(i, j) + " ");
      }
      System.out.println();
    }

    Matrix<Integer> matrixC = matrixA.add(matrixB);

    System.out.println("Матрица C:");
    
    for (int i = 0; i < matrixC.getLenght(); i++) {
      for (int j = 0; j < matrixC.getLenght(); j++) {
        System.out.print(matrixC.getElement(i, j) + " ");
      }
      System.out.println();
    }
  }
}
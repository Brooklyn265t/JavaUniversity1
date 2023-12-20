package Mirea.Homework18;

import java.io.Serializable;

public class GenericClass<T extends Comparable,V extends Animal, K> {
  private T variable1;
  private V variable2;
  private K variable3;

  public GenericClass(T variable1, V variable2, K variable3) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
  }

  public T getVariable1() {
    return variable1;
  }

  public V getVariable2() {
    return variable2;
  }

  public K getVariable3() {
    return variable3;
  }

  public void printClassNames() {
    System.out.println("Variable 1 класс: " + variable1.getClass().getName());
    System.out.println("Variable 2 класс: " + variable2.getClass().getName());
    System.out.println("Variable 3 класс: " + variable3.getClass().getName());
  }
}
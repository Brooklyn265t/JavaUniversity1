package Mirea.Homework6.Dish;

public abstract class Dish {
  protected String material;
  protected int capacity;

  protected Dish(String material, int capacity) {
    this.material = material;
    this.capacity = capacity;
  }

  public abstract void wash();

  public abstract void use();
}
package Mirea.Homework6.Dish;

public class Cup extends Dish {
  private boolean hasHandle;

  public Cup(String material, int capacity, boolean hasHandle) {
    super(material, capacity);
    this.hasHandle = hasHandle;
  }

  @Override
  public void wash() {
    System.out.println("Washing the cup");
  }

  @Override
  public void use() {
    System.out.println("Using the cup");
  }
}
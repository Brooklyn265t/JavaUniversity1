package Mirea.Homework6;

class FurnitureShop {
  private String name;

  public FurnitureShop(String name) {
    this.name = name;
  }

  public void sell(Furniture furniture) {
    System.out.println("Selling " + furniture.getClass().getSimpleName() + " at " + name);
  //будет возвращать простое имя класса объекта
  }
}

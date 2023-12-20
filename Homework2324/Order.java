package Mirea.Homework2324;

public interface Order {
  void addPosition(Item item);

  int count();

  boolean remove(String dishName);

  void deleteAll(String name);

  int costAll();

  int orderName(String p);

  String[] getDishes();
}
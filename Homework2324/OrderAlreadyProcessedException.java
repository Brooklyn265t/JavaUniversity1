package Mirea.Homework2324;

public class OrderAlreadyProcessedException extends Exception {
  public OrderAlreadyProcessedException(int ex) {
    super("Order is already added at " + ex + " table");
  }
}
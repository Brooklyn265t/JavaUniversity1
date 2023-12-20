package Mirea.Homework22;

class MultifunctionalChair implements IChair {
  @Override
  public void sit() {
    System.out.println("Сидим на многофункциональном стуле");
  }
  public int sum(int a, int b){System.out.println(a+b); return 0; }
}
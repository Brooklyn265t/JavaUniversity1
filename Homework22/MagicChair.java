package Mirea.Homework22;

class MagicChair implements IChair {
  @Override
  public void sit() {
    System.out.println("Сидим на ааа стуле");
  }
  public void doMagic() {
    System.out.println("Вжух");
    System.out.println("java.lang.OutOfMemoryError: получено retVal -1073741830, errno 112 (0x70), errno2 189858397 (0xb51025d)");
  }
}
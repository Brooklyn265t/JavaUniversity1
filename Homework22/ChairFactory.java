package Mirea.Homework22;

class ChairFactory implements AbstractChairFactory {
  public VictorianChair createVictorianChair(){
    return new VictorianChair();
  }
  public MagicChair createMagicChair(){
    return new MagicChair();
  }
  public MultifunctionalChair createMultifuctionalChair(){
    return new MultifunctionalChair();
  }
}
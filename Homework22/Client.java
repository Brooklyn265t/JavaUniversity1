package Mirea.Homework22;

class Client {
  void Sit(IChair chair) {
    chair.sit();
  }
  void Age(VictorianChair chair) {chair.getAge();}
  void Sum(MultifunctionalChair chair) {
    int a = 15;
    int b = 35;
    chair.sum(a, b);
  }
  void doMagic(MagicChair chair){
    chair.doMagic();
  }
}
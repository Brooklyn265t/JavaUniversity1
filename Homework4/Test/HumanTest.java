package Mirea.Homework4.Test;


import Mirea.Homework4.Class.Human;
import Mirea.Homework4.Class.Leg;
import Mirea.Homework4.Class.Head;
import Mirea.Homework4.Class.Hand;

public class HumanTest {
  public HumanTest() {
    Head head = new Head("brown", 1400);
    Leg leg = new Leg(100, 80);
    Hand hand = new Hand(5, true);

    Human person = new Human(head, leg, hand);

    // Test the Human class
    System.out.println("Eye color: " + person.head.getEyeColor());
    System.out.println("Brain weight: " + person.head.getBrainWeight());
    System.out.println("Leg length: " + person.leg.getLength());
    System.out.println("Leg strength: " + person.leg.getStrength());
    System.out.println("Finger count: " + person.hand.getFingerCount());
    System.out.println("Has thumb: " + person.hand.isHasThumb());
    }
}
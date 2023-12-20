package Mirea.Homework4.Class;


import Mirea.Homework4.Class.Leg;
import Mirea.Homework4.Class.Head;
import Mirea.Homework4.Class.Hand;

public class Human {
  public Head head;
  public Leg leg;
  public Hand hand;

  public Human(Head head, Leg leg, Hand hand) {
    this.head = head;
    this.leg = leg;
    this.hand = hand;
  }

  public Head getHead() {
    return head;
  }

  public Leg getLeg() {
    return leg;
  }

  public Hand getHand() {
    return hand;
  }
}

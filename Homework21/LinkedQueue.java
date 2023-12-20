package Mirea.Homework21;

import java.util.NoSuchElementException;

public class LinkedQueue<T> {
  private Node<T> front;
  private Node<T> rear;
  private int size;

  public LinkedQueue() {
    front = null;
    rear = null;
    size = 0; 
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void enqueue(T data) {
    Node<T> newNode = new Node<>(data);

    if (isEmpty()) {
      front = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }

    size++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Очередь пуста");
    }

    T data = front.data;
    front = front.next;
    size--;

    if (isEmpty()) {
      rear = null;
    }

    return data;
  }

  public void clear(){
    front = null;
    rear = null;
    size = 0;
  };

  private static class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }
}

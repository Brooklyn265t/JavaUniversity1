package Mirea.Homework21;

public class ArrayQueueModule<T> {
  private Node<T>[] array;
  private int front;
  private int rear;
  private int size;

  private static class Node<T> {
    private T data;

    public Node(T data) {
      this.data = data;
    }
  }

  public ArrayQueueModule(int capacity) {
    array = new Node[capacity];
    front = 0;
    rear = -1;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == array.length;
  }

  public void enqueue(T item) {
    if (isFull()) {
      System.out.println("Очередь заполнена.");
      return;
    }

    rear = (rear + 1) % array.length;
    array[rear] = new Node<>(item);
    size++;
  }

  public T dequeue() {
    if (isEmpty()) {
      System.out.println("Очередь пуста.");
      return null;
    }

    T item = array[front].data;
    array[front] = null;
    front = (front + 1) % array.length;
    size--;
    return item;
  }

  public T peek() {
    if (isEmpty()) {
      System.out.println("Очередь пуста.");
      return null;
    }

    return array[front].data;
  }

  public int size() {
    return size;
  }

  public void clear(){
    front = 0;
    rear = -1;
    size = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = null;
    }
  };
}

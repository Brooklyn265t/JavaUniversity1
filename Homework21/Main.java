package Mirea.Homework21;

public class Main {
  public static void main(String[] args) {
    System.out.println("Привет aaa!");
    ArrayQueueModule queue = new ArrayQueueModule(5);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println(queue.dequeue()); // Output: 1
    System.out.println(queue.peek()); // Output: 2

    queue.enqueue(4);
    queue.enqueue(5);

    System.out.println(queue.isFull()); // Output: false

    while (!queue.isEmpty()) {
      System.out.println(queue.dequeue()); // Output: 2, 3, 4, 5
    }

    System.out.println(queue.isEmpty()); // Output: true

    LinkedQueue<Integer> queue2 = new LinkedQueue<>();
    queue2.enqueue(1);
    queue2.enqueue(2);
    queue2.enqueue(3);

    System.out.println(queue2.dequeue()); // Вывод: 1
    System.out.println(queue2.dequeue()); // Вывод: 2
    System.out.println(queue2.isEmpty()); // Вывод: false
    System.out.println(queue2.size()); // Вывод: 1

  }
}
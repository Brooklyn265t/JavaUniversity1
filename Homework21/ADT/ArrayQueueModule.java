package Mirea.Homework21.ADT;

import java.util.NoSuchElementException;

public class ArrayQueueModule {
    private static int SIZE = 5;
    private static int items[] = new int[SIZE];
    private static int front, rear;

    static {
        front = -1;
        rear = -1;
    }
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        items[rear] = item;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // или любое другое значение, которое вы считаете подходящим
        }
        int item = items[front];
        front++;
        return item;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return items[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }
    public boolean isFull() {
        return rear == SIZE - 1;
    }

    public void clear() {
    }

    public int getSize() {
        return SIZE;
    }
}

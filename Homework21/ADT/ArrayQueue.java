package Mirea.Homework21.ADT;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] items;
    private int front, rear;

    public ArrayQueue(int size) {
        items = new int[size];
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

    public boolean isFull() {
        return rear == items.length - 1;
    }

    public int element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return items[front];
    }


    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int item = items[front];
        front++;
        return item;
    }


    public int size() {
        return rear - front + 1;
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    public void clear() {
        front = -1;
        rear = -1;
    }

}
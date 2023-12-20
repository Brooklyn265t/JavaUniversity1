package Mirea.Homework21.ADT;

public class ArrayQueueADT {
    private ArrayQueueModule queue;

    public ArrayQueueADT(ArrayQueueModule queue) {
        this.queue = queue;
    }
    public static ArrayQueueADT createQueue() {
        return new ArrayQueueADT(new ArrayQueueModule());
    }
    public int getSize() {
        return queue.getSize();
    }
    public void clear() {
        queue.clear();
    }

    public void enqueue(int i) {
        queue.enqueue(i);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}

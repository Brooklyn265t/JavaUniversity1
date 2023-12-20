package Mirea.Homework21.ADT;

public class main {
    public static void main(String[] args) {
        // Создаем экземпляр класса ArrayQueueModule
        ArrayQueueModule queueModule = new ArrayQueueModule();

        // Добавляем элементы в очередь
        queueModule.enqueue(1);
        queueModule.enqueue(2);
        queueModule.enqueue(3);

        // Проверяем, что очередь не пуста
        System.out.println("Is queue empty? " + queueModule.isEmpty());

        // Удаляем элементы из очереди
        System.out.println("Dequeued element: " + queueModule.dequeue());
        System.out.println("Dequeued element: " + queueModule.dequeue());

        // Проверяем, что очередь пуста
        System.out.println("Is queue empty? " + queueModule.isEmpty());

        // Создаем экземпляр класса ArrayQueueADT
        ArrayQueueADT queueADT = new ArrayQueueADT(queueModule);

        // Добавляем элементы в очередь
        queueADT.enqueue(4);
        queueADT.enqueue(5);

        // Проверяем, что очередь не пуста
        System.out.println("Is queue empty? " + queueADT.isEmpty());

        // Создаем экземпляр класса ArrayQueue
        ArrayQueue queue = new ArrayQueue(5);

        // Добавляем элементы в очередь
        queue.enqueue(6);
        queue.enqueue(7);

        // Проверяем, что очередь не пуста
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Удаляем все элементы из очереди
        queue.clear();

        // Проверяем, что очередь пуста
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
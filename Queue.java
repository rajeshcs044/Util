package com.cerner.util;

public class Queue
{
    private final int queueCapacity = 10;
    private final int[] a = new int[queueCapacity];
    int size = 0;
    int front = 0;
    int rear = -1;

    public boolean enqueue(int add)
    {
        size++;
        if (size == 101)
        {
            System.out.println("Queue is full - cannot add");
            size--;
            return false;
        }
        rear++;
        if (rear == 100)
        {
            rear = 0;
        }
        a[rear] = add;
        return true;
    }

    public int dequeue()
    {
        size--;
        if (size == -1)
        {
            System.out.println("Queue is empty - cannot remove");
            size++;
            return 0;
        }
        int number = a[front];
        front++;
        if (front == 100)
        {
            front = 0;
        }
        return number;
    }

    public int get()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty - cannot get");
            return 0;
        }
        return a[front];
    }

    public int size()
    {
        return size;
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();
        System.out.println("Added 1: " + queue.enqueue(1));
        System.out.println("Added 2: " + queue.enqueue(2));
        System.out.println(queue.size());
        System.out.println("Added 3: " + queue.enqueue(3));
        System.out.println("Added 4: " + queue.enqueue(4));
        System.out.println("Size: " + queue.size());
        System.out.println("Get: " + queue.get());
        System.out.println("Remove: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Remove: " + queue.dequeue());
        System.out.println("Get: " + queue.get());
        System.out.println("Size: " + queue.size());
    }
}

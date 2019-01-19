package com.cerner.util;

public class Stack
{
    int capacity = 10;
    int st[] = new int[capacity];
    int size = -1;

    public boolean push(int add)
    {
        if (size == capacity)
        {
            System.out.println("Stack is full");
            return false;
        }
        size++;
        st[size] = add;
        return true;
    }

    public int pop()
    {
        if (size == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int element = st[size];
        size--;
        return element;
    }

    public int peek()
    {
        if (size == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return st[size];
    }

    public int size()
    {
        return size + 1;
    }

    public boolean isEmpty()
    {
        return size == -1;
    }
}

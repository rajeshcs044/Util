package com.cerner.util;

public class DoubleLinkedList
{
    public Node addFirst(Node head, int a)
    {
        Node newNode = new Node(a);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public Node addLast(Node head, int a)
    {
        Node newNode = new Node(a);
        if (head == null)
        {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public Node removeFirst(Node head)
    {
        if (head == null)
        {
            System.out.println("Head is null. Cannot remove first since there is no head");
            return null;
        }
        Node temp = head.next;
        temp.prev = null;
        return temp;
    }

    public Node removeLast(Node head)
    {
        if (head == null)
        {
            System.out.println("Head is null. Cannot remove last since there is no head");
            return null;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp = null;
        return head;
    }

    public Node getFirst(Node head)
    {
        return head;
    }

    public Node getLast(Node head)
    {
        if (head == null)
        {
            System.out.println("Head is null. Cannot get last since there is no head");
            return null;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }

    class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}

package LinkedList;

import java.sql.Array;
import java.util.Arrays;

public class CreationOfLinkedList {
    static class Node
    {
        int data;
        Node next ;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static int size = 0;

    static Node insertAtHead(Node head,int data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        size++;
        return newNode;
    }
    static Node insertAtTail(Node head,int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp=temp.next;
        }
        temp.next = newNode;
        size++;
        return head;
    }
    static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head,1);
        head = insertAtHead(head,2);
        head = insertAtHead(head,3);
        head = insertAtTail(head,4);
        head = insertAtTail(head,5);
        printList(head);
    }
}

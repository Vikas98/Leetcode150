package LinkedList;

public class CycleCreationCode extends CreationOfLinkedList {
    static Node createCycle(Node head)
    {
        Node temp = head;
        while (temp.next != null )
        {
            temp = temp.next;
        }
        temp.next = head;

        return head;
    }
    static Node createCycle2(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node temp2 = head;
        int size = 0;
        while (size != 2) {
            temp2 = temp2.next;
            size++;
        }
        temp.next = temp2;
        return head;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head,1);
        head = insertAtTail(head,2);
        head = insertAtTail(head,3);
        head= insertAtTail(head,4);
        head = insertAtTail(head,5);
        createCycle2(head);
       // System.out.println("cycle created successfully");
        printList(head);
    }
}

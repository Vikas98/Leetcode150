package LinkedList;

import static LinkedList.CycleCreationCode.createCycle2;

public class CycleDetection extends CreationOfLinkedList {
    static boolean cycleDetection(Node head)
    {
        if(head == null) return false;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null)
        {
            if(slow==fast)
            {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        CreationOfLinkedList.Node head = null;
        head = insertAtHead(head,1);
        head = insertAtTail(head,2);
        head = insertAtTail(head,3);
        head= insertAtTail(head,4);
        head = insertAtTail(head,5);
        createCycle2(head);
       // System.out.println("cycle created successfully");
        System.out.println(cycleDetection(head));
    }
}

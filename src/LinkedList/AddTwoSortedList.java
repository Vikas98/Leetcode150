package LinkedList;

public class AddTwoSortedList extends CreationOfLinkedList{
    static Node addTwoSortedList(Node head1,Node head2)
    {
        Node newHead = new Node(-1);
        Node dummyHead = newHead;

        while (head1 != null && head2!=null)
        {
            if (head1.data<=head2.data)
            {
                Node temp = new Node(head1.data);
                dummyHead.next = temp;
                head1 = head1.next;
                dummyHead = dummyHead.next;
            }
            else
            {
                Node temp = new Node(head2.data);
                dummyHead.next = temp;
                head2 = head2.next;
                dummyHead = dummyHead.next;
            }
        }
        while (head1 !=null)
        {
            Node temp = new Node(head1.data);
            dummyHead.next = temp;
            head1 = head1.next;
            dummyHead = dummyHead.next;
        }
        while (head2 != null)
        {
            Node temp = new Node(head2.data);
            dummyHead.next = temp;
            head2 = head2.next;
            dummyHead = dummyHead.next;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        Node head1 = null;
        head1 = insertAtHead(head1,2);
        head1 = insertAtTail(head1,3);
        head1 = insertAtTail(head1,4);
        head1 = insertAtTail(head1,5);

        Node head2 = null;
        head2 = insertAtHead(head2,5);
        head2 = insertAtTail(head2,6);
        head2 = insertAtTail(head2,7);
        printList(head1);
        printList(head2);
        Node newHead = addTwoSortedList(head1,head2);
        printList(newHead);
    }
}

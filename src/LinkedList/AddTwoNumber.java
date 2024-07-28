package LinkedList;

public class AddTwoNumber extends CreationOfLinkedList {
    static  Node addTwoNumber(Node head1,Node head2)
    {
        Node newHead = new Node(-1);
        Node dummyHead = newHead;
        int n1 = 0 ,n2 = 0,sum = 0,carry = 0;
        while (head1 != null || head2!=null)
        {
            if(head1 != null)
            {
                n1 = head1.data;
                head1=head1.next;
            }
            else
            {
                n1 = 0;
            }
            if(head2 != null)
            {
                n2 = head2.data;
                head2=head2.next;
            }
            else
            {
                n2 = 0;
            }
            sum = n1+n2+carry;
            carry = sum/10;
            Node temp = new Node(sum%10);
            dummyHead.next = temp;
            dummyHead = dummyHead.next;
        }
        if(carry>0)
        {
            Node temp = new Node(carry);
            dummyHead.next = temp;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        Node head1 = null;
        head1 = insertAtHead(head1,2);
        head1 = insertAtTail(head1,4);
        head1 = insertAtTail(head1,3);
        head1 = insertAtTail(head1,5);

        Node head2 = null;
        head2 = insertAtHead(head2,5);
        head2 = insertAtTail(head2,6);
        head2 = insertAtTail(head2,4);

        printList(head1);

        printList(head2);

        Node newHead = addTwoNumber(head1,head2);

        printList(newHead);
    }

}

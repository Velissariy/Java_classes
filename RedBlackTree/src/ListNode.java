public class SIngleLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    ListNode head = new ListNode(1);
    head.next =new

    ListNode(2);

    head.next.next =new

    ListNode(3);

    head.next.next.next =new

    ListNode(4);

    head.next.next.next.next =new

    ListNode(5);

    ListNode reversedHead = reverseList(head);

// Результат: 5 -> 4 -> 3 -> 2 -> 1
        while(reversedHead !=null)

    {
        System.out.print(reversedHead.val + " ");
        reversedHead = reversedHead.next;
    }
}
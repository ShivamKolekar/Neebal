import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode newHead = stack.pop();
        ListNode newCurrent = newHead;

        while (!stack.isEmpty()) {
            newCurrent.next = stack.pop();
            newCurrent = newCurrent.next;
        }

        newCurrent.next = null; 
        return newHead;
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Original List (Example 1):");
        printList(head1);

        ListNode reversedHead1 = solution.reverseList(head1);

        System.out.println("Reversed List (Example 1):");
        printList(reversedHead1);

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("\nOriginal List (Example 2):");
        printList(head2);

        ListNode reversedHead2 = solution.reverseList(head2);

        System.out.println("Reversed List (Example 2):");
        printList(reversedHead2);

        // Example 3
        ListNode head3 = null;

        System.out.println("\nOriginal List (Example 3):");
        printList(head3);

        ListNode reversedHead3 = solution.reverseList(head3);

        System.out.println("Reversed List (Example 3):");
        printList(reversedHead3);
    }
}

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            if (head.val != val) {
                stack.push(head);
            }
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List (Example 1):");
        printList(head1);

        ListNode newHead1 = solution.removeElements(head1, 6);

        System.out.println("Updated List (Example 1):");
        printList(newHead1);

        // Example 2
        ListNode head2 = null;

        System.out.println("\nOriginal List (Example 2):");
        printList(head2);

        ListNode newHead2 = solution.removeElements(head2, 1);

        System.out.println("Updated List (Example 2):");
        printList(newHead2);

        // Example 3
        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(7);
        head3.next.next = new ListNode(7);
        head3.next.next.next = new ListNode(7);

        System.out.println("\nOriginal List (Example 3):");
        printList(head3);

        ListNode newHead3 = solution.removeElements(head3, 7);

        System.out.println("Updated List (Example 3):");
        printList(newHead3);
    }
}

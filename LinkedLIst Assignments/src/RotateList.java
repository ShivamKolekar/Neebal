class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        // Calculate the length of the linked list and find the tail node
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Adjust k to be within the length of the linked list
        k = k % length;

        if (k == 0) {
            return head; // No need to rotate if k is a multiple of the length
        }

        // Find the new head and the new tail after rotation
        int stepsToNewHead = length - k - 1;
        ListNode newTail = head;

        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null; // Disconnect the rotated part

        // Connect the rotated part to the original head
        tail.next = head;

        return newHead;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        int k1 = 2;

        RotateList solution = new RotateList();
        ListNode rotatedList1 = solution.rotateRight(head1, k1);
        System.out.print("Rotated List 1: ");
        printList(rotatedList1);

        // Example 2
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        int k2 = 4;

        ListNode rotatedList2 = solution.rotateRight(head2, k2);
        System.out.print("Rotated List 2: ");
        printList(rotatedList2);
    }
}

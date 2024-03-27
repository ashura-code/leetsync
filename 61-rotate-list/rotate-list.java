class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Find the length of the list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Calculate the actual rotation amount
        k = k % length;
        if (k == 0)
            return head;

        // Move the pointer to the node that will become the new tail after rotation
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Adjust the pointers
        tail.next = head; // Connect the original tail with the head to form a loop
        head = newTail.next; // The node after newTail becomes the new head
        newTail.next = null; // Set newTail as the new tail

        return head;
    }
}

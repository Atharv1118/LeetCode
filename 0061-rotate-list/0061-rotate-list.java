class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Avoid unnecessary rotations
        k = k % len;

        if (k == 0) return head;

        // 1. Reverse entire list
        ListNode reversal = reverse(head);

        // 2. Reverse first k elements
        ListNode first = reversal;
        ListNode curr = reversal;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        // Separate first k nodes
        ListNode remaining = curr.next;
        curr.next = null;

        // Reverse first k
        first = reverse(first);

        // 3. Reverse remaining elements
        remaining = reverse(remaining);

        // Connect both parts
        ListNode tail = first;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = remaining;

        return first;
    }

    public ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
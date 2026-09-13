class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length
        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        // Avoid unnecessary rotations
        k = k % len;

        if (k == 0) return head;

        int cnt = 0;

        tail.next = head;

        ListNode temp = head;

        while(cnt <len - k - 1){
            cnt++;
            temp = temp.next;
        }
         head = temp.next;
         temp.next = null;

    return head;
    }
}
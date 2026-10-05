class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        if (fast != null) {
            slow = slow.next;
        }

      
        ListNode curr = slow;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

   
        ListNode first = head;

        while (prev != null) {
            if (first.val != prev.val) {
                return false;
            }

            first = first.next;
            prev = prev.next;
        }

        return true;
    }
}
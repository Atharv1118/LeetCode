/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode newHead = head.next;
        ListNode last = null;
        
        while(curr != null){

            ListNode Next = curr.next;
            curr.next = prev;
            prev.next = Next;

                 // Connect previous pair to current pair
            if (last != null) {
                last.next = curr;
            }

            last = prev;

            if(Next == null || Next.next == null) {
                break;
            }

            prev = Next;
            curr = Next.next;
        }
        return newHead;
    }
}
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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        ListNode beforeMid = null;

        int mid = (size + 1) / 2;
        int cnt = 0;

        while (cnt < mid) {
            beforeMid = temp;
            temp = temp.next;
            cnt++;
        }

        // Separate the two halves
        beforeMid.next = null;

        // Reverse second half
        ListNode curr = temp;
        ListNode prev = null;

        while (curr != null) {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        // Merge
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}
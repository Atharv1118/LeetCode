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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
       if(head == null || left == right) return head;

        int i = 1;
        ListNode curr = head;
        ListNode leftPrev = null;
        ListNode Left = null;
        ListNode Right = null;
        ListNode rightNext = null;

        if(left == 1){
            Left = head;
        }
        else{
        while(i < left){

            if(i == (left - 1)){

                leftPrev = curr;
                Left = leftPrev.next;
                break;
            }
            else{

                i++;
                curr = curr.next;
            }
        }
        }

        curr = head;
        i = 1;

        while(i <= right){

            if(i == right){
                 Right = curr;
                 rightNext = curr.next;
                break;
            }
            else{
                i++;
                curr = curr.next;
            }
        }
        ListNode prev = null;
        curr = Left;
        i = 0;
        while(i < (right - left) + 1){

            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            i++;
        }

        // Right connection
        Left.next = rightNext;

        if(leftPrev != null){
            leftPrev.next = prev;
        }
        else{
            head = prev;
        }
    return head;
    }
}
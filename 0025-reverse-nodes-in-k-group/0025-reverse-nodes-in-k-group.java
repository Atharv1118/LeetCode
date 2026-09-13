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
     
    public ListNode reverseKGroup(ListNode head, int k) {
      
        ListNode temp = head;
        if(head == null ) return head;

        for(int i = 0; i<k ; i++){

            if(temp == null){
                return head;
            }
            temp = temp.next;
        }

        ListNode newHead = reverse(head , k);
        head.next = reverseKGroup( temp, k);
        
        return newHead;
       
    }
    public ListNode reverse(ListNode head , int k){

            ListNode curr = head;
            ListNode prev = null;
            
            for(int i =0; i<k ; i++){

                ListNode Next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = Next;
            }
            return prev;
        }

}
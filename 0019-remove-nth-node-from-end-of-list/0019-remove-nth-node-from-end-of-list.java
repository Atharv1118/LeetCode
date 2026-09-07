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
    public ListNode removeNthFromEnd(ListNode head, int n) {

      ListNode curr = head;
      int size = 0;
      while(curr != null){
        curr = curr.next;
        size++;
      }  

      // n and size are equal remove head , ex., - size = 3 , n = 3 so it becomes 1st node
     if(size == n){

        return head = head.next;
     }
      curr = head;
      int cnt = 0;

      int numToRemove = size - n;

      while(cnt < numToRemove - 1){

        curr = curr.next;
        cnt++;
      }

      curr.next = curr.next.next;
      return head;
    }
    
}
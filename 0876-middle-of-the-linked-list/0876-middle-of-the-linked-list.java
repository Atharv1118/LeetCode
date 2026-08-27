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
    public ListNode middleNode(ListNode head) {

      ListNode curr = head;
      int size = 0;

    // calculate the size
      while(curr != null){

        size++;
        curr = curr.next;
      }  

    int mid = size / 2;

    //reset curr to the head 
    curr = head;
    int i = 1;
      while(i <= mid){

        curr = curr.next;;
        i++;
      }

      return curr;
    }
}
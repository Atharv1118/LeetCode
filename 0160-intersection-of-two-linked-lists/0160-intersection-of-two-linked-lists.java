/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

       int sizeA = 0;
       int sizeB = 0;
       ListNode curr1 = headA;
       ListNode curr2 = headB;

       while(curr1 != null){

        sizeA++;
        curr1 = curr1.next;
       } 

       while(curr2 != null){

        sizeB++;
        curr2 = curr2.next;
       }
    
       curr1 = headA;
       curr2 = headB;
       
       if(sizeA > sizeB){

        int diff = sizeA - sizeB;

        while(diff > 0){

            curr1 = curr1.next;
            diff--;
        }
       }
       else{

        int diff = sizeB - sizeA;

        while(diff > 0){

            curr2 = curr2.next;
            diff--;
        }
       }
       while(curr1 != curr2){
        curr1 = curr1.next;
        curr2 = curr2.next;
       }
       return curr1;
    }
}
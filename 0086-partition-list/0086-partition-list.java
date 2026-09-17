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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null) return head;
        
        ListNode lesserDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);
        ListNode lesserNode = lesserDummy;
        ListNode greaterNode = greaterDummy;
        ListNode temp = head;
      
        while(temp != null){

            if(temp.val < x){
                lesserNode.next = temp;
                lesserNode = lesserNode.next;
            }
            else{
                greaterNode.next = temp;
                greaterNode = greaterNode.next;
            }
            temp = temp.next;
        }

        greaterNode.next = null;

        lesserNode.next = greaterDummy.next;

        return lesserDummy.next;
    }
}
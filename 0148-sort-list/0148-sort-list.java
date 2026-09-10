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
    public ListNode getMid(ListNode head){

    ListNode slow = head;
    ListNode fast = head;

    while(fast.next != null && fast.next.next != null){

        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

public ListNode merge(ListNode head1 , ListNode head2){

    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;

    while(head1 != null && head2 != null){

        if(head1.val < head2.val){
            temp.next = head1;
            
            head1 = head1.next;
        }
         else{
            temp.next = head2;
            
            head2 = head2.next;
        }
        temp = temp.next;
    }
        while(head1 != null ){

            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        } 
        while(head2 != null ){

            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        } 
        return dummy.next;
}

public ListNode sortList(ListNode head){

    if(head == null || head.next == null) return head;
    // Find the Mid
    ListNode mid = getMid(head);

    // Find the left anf right half
    ListNode rightHead = mid.next;
    mid.next = null;
 
    ListNode head1 = sortList(head); // dividing left half
    ListNode head2 = sortList(rightHead);// dividing right half
    
    //merge 
    return merge(head1 , head2);
}
    
}
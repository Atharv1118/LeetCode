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
    public boolean isPalindrome(ListNode head) {
        
    ArrayList<Integer> list = new ArrayList<>();
    ListNode curr = head;
    //put data into ArrayList
    while(curr != null){

        list.add(curr.val);
        curr = curr.next;
    }

    curr = head;
    int i = list.size()-1;
    while(curr != null && i >= 0){

        if(curr.val != list.get(i)){
            return false;
        }
        else{
            curr = curr.next;
            i--;
        }
    }
    return true;
    }
}
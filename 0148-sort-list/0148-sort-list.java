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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null) return head;
        ArrayList<Integer> arr = new ArrayList<>();

        // Pointer to traverse the list
        ListNode temp = head;

        // Traverse and push values into list
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Sort the list
        Collections.sort(arr);

        // Reassign sorted values to list nodes
        temp = head;
        for (int i = 0; i < arr.size(); i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }

        // Return head of sorted list
        return head;


    }
}
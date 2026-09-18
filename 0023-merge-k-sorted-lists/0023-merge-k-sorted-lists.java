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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0) return null;
        
        ArrayList <Integer> arr = new ArrayList<>();

        for(int i = 0; i<lists.length ; i++){

            ListNode temp = lists[i];

            while(temp != null){
                arr.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        for(int i =0; i < arr.size() ; i++){

            head.next = new ListNode(arr.get(i));
            head = head.next;
        }

        return dummy.next;
    }
}
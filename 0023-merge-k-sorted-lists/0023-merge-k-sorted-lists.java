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

        // Min Heap:
        // It always gives us the node having the smallest value.
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Put the head of every non-empty linked list into the heap
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }

        // Dummy node helps us easily build the answer list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Keep taking the smallest current node
        while (!pq.isEmpty()) {

            // Get and remove the smallest node
            ListNode minNode = pq.poll();

            // Add that node to our answer list
            curr.next = minNode;
            curr = curr.next;

            // The selected node's next node is now a new candidate
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }
}
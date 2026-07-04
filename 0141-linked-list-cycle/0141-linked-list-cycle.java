/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode haer = head;
        ListNode turtle = head;

        while (haer.next != null && haer.next.next != null) {
            haer = haer.next.next;
            turtle = turtle.next;

            if (haer == turtle) {
                return true;
            }
        }
        return false;
    }
}
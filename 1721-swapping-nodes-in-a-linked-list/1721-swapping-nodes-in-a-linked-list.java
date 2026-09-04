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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head;

        for(int i = 1; i < k; i++){
            front = front.next;
        }

        ListNode slow = head;
        ListNode fast = front;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        int temp = front.val;
        front.val = slow.val;
        slow.val = temp;

        return head;

    }
}
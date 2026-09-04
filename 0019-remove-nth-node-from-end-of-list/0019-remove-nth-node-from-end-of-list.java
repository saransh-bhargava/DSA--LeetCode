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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            size++;
        }
        
        int currCount = 0;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;
        curr = head;

        if(n > size) return null;

        while(size - currCount != n){
            prev = curr;
            curr = curr.next;
            currCount++;
        }
        prev.next = curr.next;
        return dummy.next;
    }
}
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
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode middle){
        ListNode prev = null;
        ListNode curr = middle;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middleNode(head);

        ListNode ptr1 = head;
        ListNode ptr2 = reverse(middle);

        

        while(ptr2 != null){
            if(ptr1.val != ptr2.val){
                return false;
            }
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }

        return true;
    }
}
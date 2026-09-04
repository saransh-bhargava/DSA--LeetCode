class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        
        // Advance 'first' to the k-th node
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        // Use two pointers to locate the k-th node from the end
        ListNode fast = first;
        ListNode second = head;
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }
        
        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}
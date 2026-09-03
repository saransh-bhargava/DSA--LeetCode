/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        ListNode tempA = headA;
        ListNode tempB = headB;

        boolean moved1 = true, moved2 = true;

        while (tempA != null && tempB != null) {

            if (tempA == tempB)
                return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
            if (tempA == null) {
                if (moved1 == true) {
                    tempA = headB;
                    moved1 = false;
                } else {
                    return null;
                }
            }
            if (tempB == null)
                if (moved2 == true) {
                    tempB = headA;
                    moved2 = false;
                } else {
                    return null;
                }
        }
        return null;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int depth(TreeNode root, int size){
        if(root == null) return size;

        int leftMax = depth(root.left, size + 1);
        int rightMax = depth(root.right, size + 1);

        return Math.max(leftMax, rightMax);

    }
    public int maxDepth(TreeNode root) {
        int size = depth(root, 0);
        return size;
    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp != null){
                list.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }else{
                List<Integer> tempList = new ArrayList<>();
                for(int i = 0; i < list.size(); i++){
                    tempList.add(list.get(i));
                }
                result.add(tempList);
                list.clear();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
        }
        return result;
    }
}
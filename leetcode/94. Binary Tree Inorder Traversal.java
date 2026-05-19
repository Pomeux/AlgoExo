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
    public List<Integer> inorderTraversal(TreeNode root) {
        return rec(root,new ArrayList<Integer>(100));
    }
    public List<Integer> rec(TreeNode root,List<Integer> lst) {
        if(root!=null) {
            rec(root.left,lst);
            lst.add(root.val);
            rec(root.right,lst);
        }
        return lst;
    }
}

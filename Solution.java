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
    private TreeNode prev = null;
    private int dif = Integer.MAX_VALUE;

    private void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        if(prev != null){
            dif = Math.min(dif, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return(dif);
    }
}

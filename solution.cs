/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    private TreeNode prev = null;
    private int dif = 99999999;

    private void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        if(prev != null) dif = Math.Min(dif, root.val - prev.val);
        prev = root;
        inorder(root.right);
    }

    public int MinDiffInBST(TreeNode root) {
        inorder(root);
        return dif;
    }
}

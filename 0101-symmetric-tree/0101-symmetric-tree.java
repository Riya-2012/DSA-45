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
    public static boolean helper(TreeNode R1,TreeNode R2){
        if(R1==null||R2==null){
            return R1==R2;

        }
        if(R1.val==R2.val){
            boolean R=helper(R1.left,R2.right);
            boolean L=helper(R1.right,R2.left);
            return R && L;
        }
        else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return helper(root.left,root.right);
    }
}
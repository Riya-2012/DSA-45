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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    public static  void helper(TreeNode r, List<Integer> L){
        if(r==null){
            return;

        }
        helper(r.left,L);
        helper(r.right,L);
         L.add(r.val);
    }
}
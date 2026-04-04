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
    public boolean isBalanced(TreeNode root) {
       height(root) ;
        return isBal;
    }

    boolean isBal = true ;
    private int height(TreeNode node){
         if( node == null) return -1 ;
        int L = height(node.left) ;
        int R = height(node.right) ;
        
        if(Math.abs(L - R) > 1) isBal = false ;

        return Math.max(L,R) + 1;
    }
}
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftHt = minDepth(root.left);
        int rightHt = minDepth(root.right);

        // if left child is null, go through right subtree
        if (root.left == null) {
            return 1 + rightHt;
        }

        // if right child is null, go through left subtree
        if (root.right == null) {
            return 1 + leftHt;
        }

        return 1 + Math.min(leftHt, rightHt);
    }
}

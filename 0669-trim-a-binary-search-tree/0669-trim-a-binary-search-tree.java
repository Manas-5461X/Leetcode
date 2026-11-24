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
    public TreeNode trimBST(TreeNode root, int low, int high) {

        if (root == null) return null;

        // first trim left and right subtrees
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        // delete current node if it is outside range
        if (root.val < low) {
            return delete(root, root.val);
        }

        if (root.val > high) {
            return delete(root, root.val);
        }

        return root;
    }

    private TreeNode delete(TreeNode root, int target) {

        if (root == null) return null;

        if (root.val < target) {
            root.right = delete(root.right, target);

        }else if (root.val > target) {
            root.left = delete(root.left, target);

        }else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
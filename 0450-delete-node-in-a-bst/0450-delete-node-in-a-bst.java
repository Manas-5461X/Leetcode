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

 /* 
 cases :
 c1: if node is leaf node simply delete by returning null 
 c2: if node has one child so return his existing child
 c3: if node has two child then find inorder successor (smallest value greater than the current node) to mast bst again - to find out go to right part of node (which i have to delete) on that right go to extreme left and that will be inorder successor , so now need to replace current node with successor value and delete successor from rightsub tree 
*/
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        

        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        }else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }else {
            if(root.left == null) { //c1
                return root.right;
            }

            if(root.right == null) { //c1
                return root.left;
            }

            TreeNode successor = findMin(root.right); // find smallest node in right subtree 
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    public TreeNode findMin(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    double prev =-Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (prev < root.val) {
                prev = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return;
        //此时root非空, root的左右子树不全为空, 交换左右子树
        TreeNode tNode = root.left;
        root.left = root.right;
        root.right = tNode;
        //分别递归左右子树
        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
    }
}
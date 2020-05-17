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
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        //root1和root2均不空
        boolean res = false;
        //以root1和root2为根节点, 判断小树是否在大树中
        if (root1.val == root2.val)
            res = HasSubtreeCore(root1, root2);
        //不在, 则分别递归两个左右子树
        if (!res) res = HasSubtree(root1.left, root2) 
            || HasSubtree(root1.right, root2);
        return res;
    }
    //小树是否在大树中
    private boolean HasSubtreeCore(TreeNode root1, TreeNode root2) {
        //小树已经遍历到叶子节点, 是
        if (root2 == null) return true;
        //大树为空, 否
        if (root1 == null) return false;
        //根节点不同, 否
        if (root1.val != root2.val) return false;
        //大小树均不空, 且根节点值相同时, 递归两树的子树
        return HasSubtreeCore(root1.left, root2.left) 
            && HasSubtreeCore(root1.right, root2.right);
    }
}
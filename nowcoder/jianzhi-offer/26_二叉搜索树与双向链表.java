import java.util.*;
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
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return pRootOfTree;
        //非递归中序遍历
        Stack<TreeNode> stack = new Stack<>();
        //pre节点用于构造链表
        TreeNode pre = null, p = pRootOfTree;
        boolean isFirst  = true;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            //将中序遍历序列中的第一个节点记为root
            if (isFirst) {
                pRootOfTree = p;
                pre = p;
                isFirst = false;
            } else {
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
    
    private TreeNode reConstructCore(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) return null;
        //前序序列的第一个值为根节点
        TreeNode root = new TreeNode(pre[startPre]);
        //遍历中序序列, 寻找根节点的位置
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                //中序序列中, 根节点的左边为左子树, 右边为右字数
                root.left = reConstructCore(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructCore(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }
}
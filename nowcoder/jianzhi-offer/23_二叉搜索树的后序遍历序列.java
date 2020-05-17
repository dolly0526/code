public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        //不为空且长度不为0时
        return VerifySquenceOfBSTCore(sequence, 0, sequence.length - 1);
    }
    //从start到end范围内, sequence是否是后序遍历
    private boolean VerifySquenceOfBSTCore(int[] seq, int start, int end) {
        //后续遍历, 最后输出根节点
        int root = seq[end];
        //找到左右子树的边界
        int edge = end;
        for (int i = start; i < end; i++)
            if (seq[i] > root) {
                edge = i;
                break;
            }
        for (int j = edge; j < end; j++) 
            if (seq[j] < root) return false;
        //此时对于根节点来说, 其左右子树满足后序遍历
        boolean left = true, right = true;
        //左右子树不空时, 分别递归
        if (edge > 0) VerifySquenceOfBSTCore(seq, 0, edge - 1);
        if (edge < end) VerifySquenceOfBSTCore(seq, edge, end - 1);
        return left && right;
    }
}
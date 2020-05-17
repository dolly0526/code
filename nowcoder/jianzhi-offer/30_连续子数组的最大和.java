public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        
        int res = array[0], sum = 0;
        for (int i = 0; i < array.length; i++) {
            //和为负数时, 把前面的全去掉, 重新开始算
            if (sum <= 0) sum = array[i];
            //否则, 加上当前的数
            else sum += array[i];
            //记录最大值
            if (sum > res) res = sum;
        }
        return res;
    }
}
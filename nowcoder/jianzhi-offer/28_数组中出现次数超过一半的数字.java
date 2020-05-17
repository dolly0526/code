public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) return 0;
        
        if (array.length == 1) return array[0];
        //记录所有数字的次数, 初始为0
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
            if (count[array[i]] > array.length / 2)
                return array[i];
        }
        return 0;
    }
}
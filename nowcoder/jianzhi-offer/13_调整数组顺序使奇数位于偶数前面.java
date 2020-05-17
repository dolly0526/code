public class Solution {
    public void reOrderArray(int [] array) {
        //类似冒泡
        for (int i = 1; i < array.length; i++) {
            //遍历到奇数时
            if ((array[i] & 1) == 1) {
                int j = i;
                //从i向前冒泡, 当碰到前一个为奇数时退出循环
                while (j > 0 && (array[j - 1] & 1) != 1) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    j--;
                }
            }
        }
    }
}
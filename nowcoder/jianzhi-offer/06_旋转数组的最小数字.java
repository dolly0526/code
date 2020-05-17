import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        //head, tail分别在前后两部分的不减序列里
        int head = 0, tail = array.length - 1;
        //若为递增, 则已找到最小元素, 如: 1 2 3 4 5
        if (array[head] < array[tail]) return array[head];
        //类似二分查找
        while (head < tail) {
            int mid = (head + tail) / 2;
            //此时head最大, tail最小
            if (tail - head == 1) break;
            //特殊情况, 必须顺序查找, 如: 1 0 1 1 1
            if (array[head] == array[tail] && array[head] == array[mid]) {
                int result = array[head];
                while (head < tail) {
                    if (result < array[head]) result = array[head];
                    head++;
                }
                return result;
            }
            //mid在前一半序列里, 如: 2 2 2 1 2
            if (array[head] <= array[mid]) head = mid;
            else tail = mid;
        }
        return array[tail];
    }
}
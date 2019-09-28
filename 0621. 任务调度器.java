/**
 * 最简单的情况是: 频率最高的任务依次排列, 两两间隔n
 * 接着其他任务向间隔插入; 若没有间隔则返回tasks.length
 */
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        //统计每种任务出现的次数, 找出最大值
        int[] count = new int[26];
        for (char task : tasks) count[task - 'A']++;
        Arrays.sort(count);
        
        //记录出现频率同样最高的任务的个数
        int maxCount = 1;
        for (int i = 24; i >= 0; i--) {
            if (count[i] != count[25]) break;
            maxCount++;
        }
        
        //返回的结果至少为tasks的长度, 需要冷却的情况则取决于频率最高的任务
        return Math.max(tasks.length, (count[25] - 1) * (n + 1) + maxCount);
    }
}
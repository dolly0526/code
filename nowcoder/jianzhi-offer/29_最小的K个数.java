import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(k > input.length || k == 0) return result;
        //维护一个大小为k的大顶堆
        Queue<Integer> heap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i : input) {
            if (heap.size() < k) heap.offer(i);
            //如果比堆顶小，删除堆顶，新数入堆
            else if (heap.peek() > i) {
                heap.poll();
                heap.offer(i);
            }
        }
        for (int i : heap) result.add(i);
        return result;
    }
}
class KthLargest { //维护一个容量为k的小顶堆
	private PriorityQueue<Integer> q;
	private final int k;
	
    public KthLargest(int k, int[] nums) {
        this.k = k;
		q = new PriorityQueue<>(k);
		for (int i : nums) {
			add(i);
		}
    }
    
    public int add(int val) {
        if (q.size() < k) {
			q.offer(val);
        } else if (q.peek() < val) {
			q.poll();
			q.offer(val);
		}
		return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

//大顶堆
PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(3, new Comparator<Integer>(){
    @Override
    public int compare(Integer i1,Integer i2){
        return i2-i1;
    }
});
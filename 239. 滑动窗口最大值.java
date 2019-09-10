class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0){
			return nums;
		} //排除特殊情况

		Deque<Integer> deque = new LinkedList(); //双向队列存放下标
		int[] result = new int[nums.length - k + 1]; //结果数组

		for (int i = 0; i < nums.length; i++) {
			if (i >= k && deque.peekFirst() <= i - k) {
				deque.pollFirst(); //移动导致队头在窗口外, 应删去
			}

			while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.pollLast(); //如果新来的元素比队尾元素大, 则可删去队尾; 始终保持队头是最大元素
			}
			deque.offerLast(i); //新来的元素比较小, 则添加到队尾

			if (i >= k - 1) {
				result[i - k + 1] = nums[deque.peekFirst()];
			}
		}
		return result;
    }
}
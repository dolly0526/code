class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int[] res = new int[T.length];
        //下标堆栈, 对应的T子列单调不增
        Deque<Integer> stack = new ArrayDeque<>();
        
        //逆序遍历, 从而第i天之后的温度情况已知
        for (int i = T.length - 1; i >= 0; i-- ) {
            
            //对于T[i], 一直弹出栈顶元素, 直到栈顶元素比T[i]大
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            
            //若栈为空, 则后面没有比当前天温度高的
            //栈不为空, 栈顶元素减去当前下标即为所求
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            //从后往前遍历, 必须把当前的循环变量保存下来
            stack.push(i);
        }
        return res;
    }
}
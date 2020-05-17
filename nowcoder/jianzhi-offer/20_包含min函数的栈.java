import java.util.Stack;

public class Solution {

    //正常进出的栈
    private Stack<Integer> dataStack = new Stack<>();
    //只让更小的值进栈
    private Stack<Integer> minStack = new Stack<>();
    
    public void push(int node) {
        dataStack.push(node);
        if (minStack.empty() || node < minStack.peek())
            minStack.push(node);
    }
    
    public void pop() {
        int node = dataStack.pop();
        //如果minStack栈顶的元素出栈了, 也要把它移除
        if (node == minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
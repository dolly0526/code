import java.util.Stack;

public class Solution {
    Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
    
    public void push(int node) {
        s1.push(node);
    }
    
    public int pop() {
        //两个栈拼起来变成一个队列
        if (s2.empty()) while(!s1.empty())
                s2.push(s1.pop());
        return s2.pop();
    }
}
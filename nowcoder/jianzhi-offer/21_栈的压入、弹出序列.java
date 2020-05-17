import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || pushA.length == 0) return true;
        //index记录出栈个数,也为popA的下标
        int len = pushA.length, index = 0;
        //不断判断栈顶元素和出栈顺序是否相等, 相等则出栈, 否则继续入栈
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.empty();
    }
}
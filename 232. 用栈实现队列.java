class MyQueue {

	private Stack<Integer> mainStack; 
	//利用两个栈实现队列, 先进后出-->先进先出
	
    /** Initialize your data structure here. */
    public MyQueue() {
        mainStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        mainStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
		Stack<Integer> tempStack = new Stack<>();
        while(!mainStack.empty()){
			tempStack.push(mainStack.pop());
        }
		int result = tempStack.pop();
		while(!tempStack.empty()){
			mainStack.push(tempStack.pop());
		}
		return result;
    }
    
    /** Get the front element. */
    public int peek() {
        Stack<Integer> tempStack = new Stack<>();
        while(!mainStack.empty()){
			tempStack.push(mainStack.pop());
        }
		int result = tempStack.peek();
		while(!tempStack.empty()){
			mainStack.push(tempStack.pop());
		}
		return result;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mainStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
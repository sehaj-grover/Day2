class MyQueue {

    Stack<Integer> stk= new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
       
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stk.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(this.empty()){return -1;}
        Stack<Integer> stk2= new Stack<>();
        while(!stk.empty()){stk2.push(stk.pop());}
        int value=stk2.pop();
        while(!stk2.empty()){stk.push(stk2.pop());}
        return value;
    }
    
    /** Get the front element. */
    public int peek() {
        if(this.empty()){return -1;}
        Stack<Integer> stk2= new Stack<>();
        while(!stk.empty()){stk2.push(stk.pop());}
        int value=stk2.peek();
        while(!stk2.empty()){stk.push(stk2.pop());}
        return value;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk.empty();
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
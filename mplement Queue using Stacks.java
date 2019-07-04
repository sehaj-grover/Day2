class MyQueue {

    Stack<Integer> inStk= new Stack<>();
    Stack<Integer> outStk= new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
       
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        inStk.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStk.isEmpty()){this.transfer();}
        return outStk.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(outStk.isEmpty()){this.transfer();}
        return outStk.peek();
    }
    public void transfer() {
        while(!inStk.isEmpty()){outStk.push(inStk.pop());}
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStk.empty() && outStk.empty();
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
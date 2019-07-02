class MyQueue {

    int start,last;
    int arr[]=new int[1000];
    /** Initialize your data structure here. */
    public MyQueue() {
        start=-1;
        last=-1;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        arr[++last]=x;
        if(start==-1)
        {start++;}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!this.empty()){return arr[start++];}
        return -1;
    }
    
    /** Get the front element. */
    public int peek() {
        if(!this.empty()){return arr[start];}
        return -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (start>last || start==-1){return true;}
        return false;
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
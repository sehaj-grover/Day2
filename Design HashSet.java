class MyHashSet {

    int arr[]=new int[1000000];
    int size,location;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        size=0;
        location=-1;
    }
    
    public void add(int key) {
        if(!this.contains(key)){arr[size++]=key;}
    }
    
    public void remove(int key) {
        if(this.contains(key)){
            for(int i=location;i<size;i++)
            {
               
                    arr[i]=arr[i+1];
                
            }
            location=-1;
            size--;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
     for(int i=0;i<size;i++){if(arr[i]==key){ location=i;return true;}}   
    return false;    
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
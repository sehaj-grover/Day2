class MyHashSet {

    int buckets=1000;
    int bucketItems=1000;
    boolean [][] values = new boolean[buckets][];
    public int hashcode(int value){return value%buckets;}
    public int pos(int value){return value/buckets;}
    
    /** Initialize your data structure here. */
    public MyHashSet() {

    }
    
    public void add(int value) {
        int hashcode=hashcode(value);
        int pos=pos(value);
        if(values[hashcode]==null){values[hashcode]= new boolean[bucketItems];}
        values[hashcode][pos]=true;
    }
    
    public void remove(int value) {
        int hashcode=hashcode(value);
        int pos=pos(value);
        values[hashcode][pos]=false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int value) {
     int hashcode=hashcode(value);
     int pos=pos(value);
        return values[hashcode]!=null && values[hashcode][pos];
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
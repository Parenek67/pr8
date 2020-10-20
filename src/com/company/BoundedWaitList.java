package com.company;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void add(E ob) {
        capacity--;
        if(capacity>=0)
        q.add(ob);
    }
    public String toString(){
        return q.toString();
    }
}

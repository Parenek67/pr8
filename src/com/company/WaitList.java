package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> q = new ConcurrentLinkedQueue<E>();
    public WaitList(){}
    public WaitList(Collection<E> c){
        q.addAll(c);
    }
    @Override
    public void add(E ob) {
        q.add(ob);
    }
    @Override
    public E remove() {
        q.remove();
        return null;
    }
    @Override
    public boolean constains(E ob) {
        return q.contains(ob);
    }
    @Override
    public boolean constainsAll(Collection<E> c) {
        return q.containsAll(c);
    }
    public String toString(){
        return q.toString();
    }
}

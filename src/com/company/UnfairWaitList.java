package com.company;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(){}
    public E remove(E ob) {
        int s = 0;
        do{
            if(q.peek() == ob)
                q.remove();
            q.offer(q.peek());
            q.remove();
            s++;
        }while(s<q.size());
        return ob;
    }
    public void MoveToBack(E ob){
        remove(ob);
        q.offer(ob);
    }
}

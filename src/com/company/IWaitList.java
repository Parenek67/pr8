package com.company;

import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean constains(E element);
    boolean constainsAll(Collection<E> c);
}

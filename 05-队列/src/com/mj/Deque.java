package com.mj;

import com.mj.list.LinkedList;
import com.mj.list.List;

public class Deque<E> {
    private List<E> list = new LinkedList<>();

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enDequeRear(E element) {
        list.add(element);
    }

    public E deDequeFront() {
        return list.remove(0);
    }

    public void enDequeFront(E element) {
        list.add(0, element);
    }

    public E deDequeRear() {
        return list.remove(list.size() - 1);
    }

    public E front() {
        return list.get(0);
    }

    public E rear() {
        return list.get(list.size() - 1);
    }

}

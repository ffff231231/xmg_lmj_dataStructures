package com.mj.circle;

import com.mj.AbstractList;

public class SingleCircleLinkedList<E> extends AbstractList<E> {
    private Node<E> first;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public void add(int index, E element) {

        rangeCheckForAdd(index);
        if (index == 0) {
            // 拿到最后一个节点
            Node<E> last = (size == 0) ? first : node(size - 1);

            first = new Node<>(element, first);
            last.next = first;
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }

        size++;
    }

    @Override
    public E get(int index) {

        return node(index).element;
    }

    @Override
    public E set(int index, E element) {

        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(node.element)) return i;
                node = node.next;
            }
        }
        return DEFAULT_NOT_FOUND;
    }


    @Override
    public E remove(int index) {

        rangeCheck(index);
        Node<E> old = first;
        if (index == 0) {
            if (size == 1){
                first = null;
            } else {
                // 拿到最后一个节点
                Node<E> last = node(size - 1);

                first = first.next;
                last.next = first;
            }
        } else {
            Node<E> prev = node(index - 1);
            old = prev.next;
            prev.next = old.next;
        }

        size--;
        return old.element;
    }

    /**
     * 获取index位置对应的节点对象
     *
     * @param index
     * @return
     */
    private Node<E> node(int index) {
        rangeCheck(index);

        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node<E> node = first;
        string.append("size=").append(size).append(",[");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(", ");
            }
            string.append(node.element);
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}

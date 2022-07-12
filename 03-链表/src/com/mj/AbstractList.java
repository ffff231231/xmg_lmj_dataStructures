package com.mj;

public abstract class AbstractList<E> implements List<E>{

    /**
     * 元素的数量
     */
    protected int size;

    /**
     * 获取元素的数量
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 添加元素到尾部
     * @param element
     */
    public void add(E element) {
        add(size, element);
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return indexOf(element) != DEFAULT_NOT_FOUND;
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }

    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);
    }

}

package com.mj;

public interface List<E> {
    int DEFAULT_NOT_FOUND = -1;

    /**
     * 获取元素的数量
     *
     * @return
     */
    int size();

    /**
     * 判断是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 清除所有元素
     */
    void clear();


    /**
     * 添加元素到尾部
     *
     * @param element
     */
    void add(E element);

    /**
     * 在index位置插入一个元素
     *
     * @param index
     * @param element
     */
    void add(int index, E element);

    /**
     * 获取index位置的元素
     *
     * @param index
     * @return
     */
    E get(int index);

    /**
     * 设置index位置的元素
     *
     * @param index
     * @param element
     * @return
     */
    E set(int index, E element);

    /**
     * 查看元素的索引
     *
     * @param element
     * @return
     */
    int indexOf(E element);

    /**
     * 是否包含某个元素
     *
     * @param element
     * @return
     */
    boolean contains(E element);

    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    E remove(int index);
}

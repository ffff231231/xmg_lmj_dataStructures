package com.mj;

import com.mj.printer.BinaryTrees;
import com.mj.tree.AVLTree;

public class Main {

    static void test1() {
        Integer[] data = {7, 4, 9, 2, 5, 8, 11, 10, 3, 1, 12};
        AVLTree<Integer> avl = new AVLTree<>();

        for (int i = 0; i < data.length; i++) {
            avl.add(data[i]);
        }

        BinaryTrees.println(avl);
    }

    public static void main(String[] args) {
        test1();
    }
}

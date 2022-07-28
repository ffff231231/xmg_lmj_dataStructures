package com.mj;

import com.mj.printer.BinaryTrees;
import com.mj.tree.BST;

public class Main {

    static void test1() {
        Integer[] data = {7, 4, 9, 2, 5, 8, 11, 10, 3, 1, 12};
        BST<Integer> bst = new BST<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);
    }

    public static void main(String[] args) {
        test1();
    }
}

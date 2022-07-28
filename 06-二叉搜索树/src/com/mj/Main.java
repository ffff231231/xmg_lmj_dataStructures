package com.mj;

import com.mj.printer.BinaryTrees;

import java.util.Comparator;

public class Main {

    private static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getAge() - e2.getAge();
        }
    }

    private static class PersonComparator2 implements Comparator<Person> {

        @Override
        public int compare(Person e1, Person e2) {
            return e2.getAge() - e1.getAge();
        }
    }

    static void test1() {
        Integer[] data = {7, 4, 9, 2, 5, 8, 11, 10, 3, 1, 12};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);

//        bst.levelOrder(new BinarySearchTree.Visitor<Integer>() {
//            @Override
//            public boolean visit(Integer element) {
//                System.out.print(element + " ");
//                return element == 2 ? true : false;
//            }
//        });

        System.out.println(bst.height1());
    }

    static void test2() {
        Integer[] data = {7, 4, 9, 2, 5, 8, 11, 3, 1, 12};

        BinarySearchTree<Person> bst1 = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst1.add(new Person(data[i]));
        }

        BinaryTrees.println(bst1);

        BinarySearchTree<Person> bst2 = new BinarySearchTree<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        for (int i = 0; i < data.length; i++) {
            bst2.add(new Person(data[i]));
        }

        BinaryTrees.println(bst2);
    }

    public static void main(String[] args) {
        test1();

//        BinarySearchTree<Person> bst2 = new BinarySearchTree<>(new PersonComparator());
//        bst2.add(new Person(12));
//        bst2.add(new Person(15));
//
    }
}

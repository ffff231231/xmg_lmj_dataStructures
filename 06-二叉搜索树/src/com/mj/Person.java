package com.mj;

public class Person implements Comparable<Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person element) {
        return age - element.age;
    }

    @Override
    public String toString() {
        return "age=" + age;
    }
}

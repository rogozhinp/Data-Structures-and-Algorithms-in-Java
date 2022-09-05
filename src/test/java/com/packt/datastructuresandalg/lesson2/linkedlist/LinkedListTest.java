package com.packt.datastructuresandalg.lesson2.linkedlist;

import org.junit.Test;

public class LinkedListTest  {

    private LinkedList<Integer> list;

    @Test
    public void constructorTest() {
        list = new LinkedList<>();
        list.addFront(1);
        list.addFront(5);
        list.addAfter(list.find(5).get(), 15);
        System.out.println(list);
    }
}
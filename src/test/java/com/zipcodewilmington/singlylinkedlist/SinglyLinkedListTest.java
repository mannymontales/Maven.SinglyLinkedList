package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertNotNull(llist);
    }

    @Test
    public void testIsEmpty() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertNotNull(llist);
        Assert.assertEquals(true, llist.isEmpty());
    }

    @Test
    public void testAdd1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(42);
        Assert.assertEquals(false, llist.isEmpty());
    }

    @Test
    public void testAdd2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(2);
        llist.add(4);
        Assert.assertEquals(false, llist.isEmpty());
    }

    @Test
    public void testToString() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();

        String expected = "head -> NULL";

        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(2);

        String expected = "head -> [2] -> NULL";

        Assert.assertEquals(expected, llist.toString());
    }

    @Test
    public void testToString3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(67);
        llist.add(2);
        String expected = "head -> [67] -> [2] -> NULL";

        Assert.assertEquals(expected, llist.toString());
    }

    //Method Size

    @Test
    public void testSize() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);

        Assert.assertEquals(1, llist.size());
    }

    @Test
    public void testSize2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);

        Assert.assertEquals(2, llist.size());
    }
}

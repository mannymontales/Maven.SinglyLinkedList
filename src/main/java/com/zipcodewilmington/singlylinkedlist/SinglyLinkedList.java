package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head; // head of linked list

    //https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
    //linked list node is own object
    static class Node {
        int data;
        Node next;//class that calls itself?? reference to the next 'Node' object in the sequence
        //instance of object that points to the next element

        //Constructor to create a new node
        //next is by default initialized as null
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add -- add an element to the list
    public static SinglyLinkedList add(SinglyLinkedList element, int data){
        //Create new node with the given data
        Node newNode = new Node(data);

        //if the linked list is empty, then make the new node as the head
        if (element.head == null){

            element.head = newNode;//head is not keyword it is created if the linked list is empty can be named element.badofalo

        } else {
            //else traverse till the last node and insert the newNode there
            //The next property of the last Node in the list is then updated to reference the new Node, effectively linking the elements together.
            Node lastNode = element.head;

        }
        return element;
    }
    //remove -- remove an element (specified by numeric index) from the list
    //contains -- returns true if the element is in the list, false otherwise
    //find -- returns the element's index if it is in the list, -1 otherwise
    //size -- returns the current size of the list
    //get -- returns the element at the specified index
    //copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    //sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
}

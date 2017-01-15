package com.sahuja.ds.fundamentals;

/**
 * Created by Sourabh on 1/14/2017.
 */
public class CircularLinkedList<E> {
    private static class Node<E> {

        private E element;            // reference to the element stored at this node
        private Node<E> next;         // reference to the subsequent node in the list
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    //The first node in the list. It is not a separate pointer node.
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {

    }

    public void rotate() {
        tail = tail.getNext();
    }

    public void addFirst(E e) {
        if(size == 0){
            tail = new Node<E>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> firstElement = new Node<E>(e, tail.getNext());
            tail.setNext(firstElement);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        Node<E> first = tail.getNext();
        tail.setNext(first.getNext());
        return first.getElement();
    }

}

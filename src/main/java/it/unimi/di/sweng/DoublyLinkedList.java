package it.unimi.di.sweng;


import java.util.LinkedList;
import java.util.Objects;

public class DoublyLinkedList<T>{
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void push(T value){
        Node nodo = new Node(value);
        if (Objects.isNull(head)){
            head = nodo;
        }else{
            nodo.prev=tail;
            tail.next=nodo;
        }
        tail = nodo;
    }

    public T pop(){
        if (tail==null){
            throw new IllegalStateException("Empty List: illegal pop operation");
        }
        T value = tail.value;
        if (head==tail){
            head=null;
        }
        tail= tail.prev;
        return value;
    }

    public T shift(){
        if (head==null){
            throw new IllegalStateException("Empty List: illegal shift operation");
        }
        T value = head.value;
        if (head==tail){
            tail=null;
        }
        head=head.next;
        return value;
    }

    public void unshift(T value){
        Node nodo = new Node(value);
        if (Objects.isNull(head)){
            head = nodo;
            tail = nodo;
        }else{
            nodo.next=head;
            head.prev=nodo;
            head=nodo;
        }
    }

    public class Node {
         final T value;
         Node next = null;
         Node prev = null;

        public Node(T value){
            this.value=value;
        }
    }

}

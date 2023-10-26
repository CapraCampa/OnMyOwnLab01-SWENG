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
            tail = nodo;
        }else{
            nodo.prev=tail;
            tail.next=nodo;
            tail=nodo;
        }
    }

    public T pop(){
        T value = tail.value;
        if (head==tail){
            head=null;
        }
        tail= tail.prev;
        return value;
    }

    public T shift(){
        T value = head.value;
        if (head==tail){
            tail=null;
        }
        head=head.next;
        return value;
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

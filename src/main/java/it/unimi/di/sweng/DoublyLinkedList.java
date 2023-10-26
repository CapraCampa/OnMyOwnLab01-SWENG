package it.unimi.di.sweng;


import java.util.LinkedList;
import java.util.Objects;

public class DoublyLinkedList<Integer>{
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void push(int num){
        Node nodo = new Node(num);
        if (Objects.isNull(head)){
            head = nodo;
            tail = nodo;
        }else{
            nodo.prev=tail;
            tail.next=nodo;
            tail=nodo;
        }
    }

    public int pop(){
        int value = tail.num;
        if (head==tail){
            head=null;
        }
        tail= tail.prev;
        return value;
    }

    public static class Node {
         final int num;
         Node next = null;
         Node prev = null;

        public Node(int num){
            this.num=num;
        }
    }

}

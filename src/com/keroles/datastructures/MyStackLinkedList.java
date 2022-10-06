package com.keroles.datastructures;

public class MyStackLinkedList {

    private MyStackLinkedListNode head=null;

    public class MyStackLinkedListNode{

        private int data;
        private MyStackLinkedListNode next;

        public MyStackLinkedListNode(int data) {
            this.data = data;
            this.next=null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public MyStackLinkedListNode getNext() {
            return next;
        }

        public void setNext(MyStackLinkedListNode next) {
            this.next = next;
        }
    }

    public void push(int data){
        MyStackLinkedListNode next_node=new MyStackLinkedListNode(data);
        if (!isEmpty()) {
            MyStackLinkedListNode temp = head;
            next_node.next = temp;
        }
        head=next_node;
    }

    public void pop(){
        if (!isEmpty()) {
            head=head.next;
        }
    }

    public void display(){
        MyStackLinkedListNode nextNode=head;
        while (nextNode!=null){
            System.out.println(nextNode.getData());
            nextNode=nextNode.getNext();
        }
    }
    public boolean isEmpty(){
        if (head==null){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
}

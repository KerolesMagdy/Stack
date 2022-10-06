package com.keroles.datastructures;

public class Main {

    public static void main(String[] args) {

        //Stack as array
        MyStack stack=new MyStack();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.display();

        //Stack as linked list
        MyStackLinkedList stack2=new MyStackLinkedList();
        stack2.push(1);
        stack2.push(2);
        stack2.pop();
        stack2.push(3);
        stack2.push(4);
        stack2.pop();
        stack2.pop();
        stack2.push(5);
        stack2.display();

    }
}

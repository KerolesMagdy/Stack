package com.keroles.datastructures;

public class MyStack {
    private final int size=5;
    private int arr[]=new int[size];
    private int top=-1;


    public void push(int value){

        if (!isFull()) {
            top++;
            arr[top]=value;
        }
    }

    public void pop(){

        if (!isEmpty()) {
            top--;
        }
    }

    public void display(){
        for (int i : arr) {
            System.out.println(i);

        }
    }

    public boolean isFull(){
        if (top==size-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return arr[top];
        }
    }
    public boolean isEmpty(){
        if (top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top;
    }
}

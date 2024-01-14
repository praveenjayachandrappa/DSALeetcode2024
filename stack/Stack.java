package stack;

import java.util.Scanner;

public class Stack {


    int size;

    int top;

    int[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int x) {

        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int x = stack[top];
            top--;
            return x;
        }
    }

    public int peek(){
        //check if stack is empty
        if(this.top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public boolean isFull(){
        return top==size-1 ? true:false;
    }

    public void display(){

        for (int i = 0; i <=top ; i++) {

            System.out.print(stack[i]+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {


        Stack stack=new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());

    }
}

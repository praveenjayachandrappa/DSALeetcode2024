package stack;

public class StackL {

    class Node{

        int val;

        Node next;

    }


    Node top;

    public StackL() {
        this.top =null;
    }

    public void push(int x){

        Node temp=new Node();


        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if(temp==null){

            System.out.println("Stack overflow");
            return;
        }
        temp.val=x;
        temp.next=top;
        top=temp;
    }


    public int pop(){

        if(top==null){

            System.out.println("Stack underflow");
            return -1;
        }
        int x=top.val;
        top=top.next;
        return x;
    }


    public int peek(){

        if(!isEmpty()){
            return this.top.val;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }

    }

    public boolean isEmpty(){

        return top==null ? true:false;
    }


    public void display(){

       if(isEmpty()) {
           System.out.println("Stack is empty");
           return;
       }
       else{

           Node ptr=top;

           while (ptr!=null){

               System.out.print(ptr.val);
               ptr=ptr.next;
               if(ptr!=null)
               System.out.println("->");
           }
       }

    }

    public static void main(String[] args) {

        StackL stack=new StackL();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.display();


    }
}

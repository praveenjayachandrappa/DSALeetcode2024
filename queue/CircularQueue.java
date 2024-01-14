package queue;

import java.util.function.DoubleToIntFunction;

public class CircularQueue {

    int size;

    int[] q;
    int front;
    int rear;

    public CircularQueue(int size){

        this.size=size;
        q=new int[this.size];
        front=0;
        rear=0;
    }


    public void enqueue(int x){

        if((rear+1)%size==front){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%size;
        q[rear]=x;
    }


    public int dequeue(){

        if(front==rear){

            System.out.println("Queue is empty");
            return -1;
        }
        front=(front+1)%size;
        int x=q[front];
        q[front]=0;
        return x;
    }

    public void display(){

        int i=front+1;

        do{
            System.out.print(q[i]+" ");
            i=(i+1)%size;
        }while (i!=(rear+1)%size);

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue circularQueue=new CircularQueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();


    }
}

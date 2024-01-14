package queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingLinkedList<T> {


    private static class QueueNode<T> {

        T val;
        QueueNode next;

        public QueueNode(T val) {
            this.val = val;
            this.next = null;
        }
    }

    QueueNode front, rear;

    QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T x) {
        QueueNode node = new QueueNode(x);
        if (node == null) {
            System.out.println("Queue is full");
            //heap is full then queue is full
            return;
        }
        //is it node I am inserting
        if (front == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }


    public T dequeue() {

        if(front==null){
            System.out.println("Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        }
       T x= (T) front.val;
        front=front.next;
        return x;
    }

    public void display(){

        QueueNode ptr=front;

        while (ptr!=null){

            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        //QueueUsingLinkedList<Integer> queueUsingLinkedList=new QueueUsingLinkedList<>();
//
//        queueUsingLinkedList.enqueue(10);
//        queueUsingLinkedList.enqueue(20);
//        queueUsingLinkedList.enqueue(30);
//        queueUsingLinkedList.enqueue(40);
//
//        queueUsingLinkedList.display();
//
//        Integer dequeue = queueUsingLinkedList.dequeue();
//        System.out.println("Returned value is "+dequeue);
//        queueUsingLinkedList.display();

    QueueUsingLinkedList<String> queueUsingLinkedList=new QueueUsingLinkedList<>();

    queueUsingLinkedList.enqueue("praveen");
    queueUsingLinkedList.enqueue("pooja");
    queueUsingLinkedList.enqueue("kiran");
    queueUsingLinkedList.enqueue("andy");
    queueUsingLinkedList.enqueue("bob");
    queueUsingLinkedList.display();

        System.out.println(queueUsingLinkedList.dequeue());
        queueUsingLinkedList.display();

        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());

        queueUsingLinkedList.display();

    }
}
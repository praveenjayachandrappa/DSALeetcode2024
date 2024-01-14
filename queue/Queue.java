package queue;

public class Queue {

    int f,r;
    int[] q;
    int size;

    public Queue(int size) {
        this.f = -1;
        this.r = -1;
        this.size = size;
        this.q=new int[size];
    }

    public void enqueue(int x){

        if(isFull()){
            System.out.println("Queue is full...");
            return;
        }
        r=r+1;
        q[r]=x;
    }


    public int dequeue(){

        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        f=f+1;
        int x=q[f];
        return x;
    }


    public boolean isEmpty(){
        return r==f?true:false;
    }

    public boolean isFull(){
        if(r==size-1){
            return true;
        }
        return false;
    }

    public void display(){
        for (int i = f+1; i <=r ; i++) {

            System.out.print(q[i]+" ,");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Queue queue=new Queue(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();

    }
}

package queue;

public class Deque {

    //using doubly linked list
    static class Node {

        int val;

        Node next, prev;

        public Node(int val) {
            this.val = val;
            this.next = this.prev = null;
        }
    }

    Node front, rear;

    int size;

    public Deque() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return this.size;
    }


    // Function to insert an element
    // at the front end
    void insertFront(int x) {

        Node node = new Node(x);

        if (node == null) {
            System.out.println("dequeue is overflow");
        } else {
            if (front == null) {
                front = node;
                rear = front;
            } else {
                node.next = front;
                front.prev = node;
                front = node;
            }
            this.size++;
        }
    }

    // Function to insert an element
    // at the rear end
    public void insertRear(int x) {
        Node node = new Node(x);

        if (node == null) {

            System.out.println("dequeue is overflow");
            return;
        } else {
            if (rear == null) {
                rear = node;
                front = rear;
            } else {
                rear.next = node;
                node.prev = rear;
                rear = node;
            }
            this.size++;
        }
    }

    // Function to delete the element
    // from the front end
    public void deleteFront() {

        // If deque is empty then
        // 'Underflow' condition
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            front = front.next;
            if (front == null) {
                // If only one element was present
                rear = null;
            } else {
                front.prev = null;
            }
            this.size--;
        }
    }

    // Function to delete the element
    // from the rear end
    public void deleteRear() {

        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            rear = rear.prev;
            //if only one node was present
            if (rear == null) {
                front = null;
            }
            rear.next = null;
            this.size--;
        }
    }

    public void display() {

        Node temp = this.front;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getFront() {

        if (isEmpty())
            return -1;
        return front.val;
    }

    public int getRear() {

        if (isEmpty()) return -1;

        return rear.val;
    }

    public static void main(String[] args) {

        Deque deque = new Deque();

        //System.out.println(deque.isEmpty());

        deque.insertFront(10);
        deque.insertFront(20);
        deque.insertFront(30);
        deque.insertRear(40);
        deque.insertRear(50);
        deque.insertRear(60);

        deque.display();

//        System.out.println(deque.getFront()); //30
//
//        System.out.println(deque.getRear()); //60

        deque.deleteFront();
        deque.deleteRear();
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());

        System.out.println(deque.size());
    }
}
package threadCommunication;

public class DemoThread {

    public static void main(String[] args) {

        SharedResource sharedResource=new SharedResource();

        Thread t1=new Thread(()->sharedResource.methodOne());

        Thread t2=new Thread(()->sharedResource.methodTwo());

        t1.setName("Thread-A");

        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}

package threadCommunication;

public class SharedResource {


    synchronized void methodOne()
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getName()+" is relasing the lock and going to wait");

        try
        {
            wait();        //releases the lock of this object and waits
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(t.getName()+" got the object lock back and can continue with it's execution");
    }

    synchronized void methodTwo()
    {
        Thread t = Thread.currentThread();

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        notifyAll();    //wakes up one thread randomly which is waiting for lock of this object

        System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());
    }
}

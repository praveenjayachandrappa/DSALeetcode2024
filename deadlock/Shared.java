package deadlock;

public class Shared {


    synchronized void methodOne(Shared s)
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getName()+"is executing methodOne...");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(t.getName()+"is calling methodTwo...");

        s.methodTwo(this);

        System.out.println(t.getName()+"is finished executing methodOne...");
    }
    synchronized void methodTwo(Shared s)
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getName()+"is executing methodTwo...");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(t.getName()+"is calling methodOne...");

        s.methodOne(this);

        System.out.println(t.getName()+"is finished executing methodTwo...");
    }
}



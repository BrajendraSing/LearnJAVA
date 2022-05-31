
public class MultipleThread
{
    public static void main(String[] args) throws InterruptedException
    {
        Multithread t1 = new Multithread("One");
        Multithread t2 = new Multithread("Two");
        Multithread t3 = new Multithread("Three");
        Multithread t4 = new Multithread("Four");
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        
    }
    
}

class Multithread implements Runnable
{
    Thread t;
    String name;

    Multithread(String name)
    {
        this.name = name;
        t = new Thread(this, name);
    }

    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println( name + " Thread : " + i);
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println(name + " Interrupted ");
            }
        }
        
        System.out.println("Exiting " + name + " Thread");
    }
    
}

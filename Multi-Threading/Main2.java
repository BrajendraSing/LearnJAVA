//Implementing the Runnable interface
public class Main2
{
    public static void main(String[] args)
    {
        NewThread thread = new NewThread();
        Thread th = new Thread(thread);
        th.start();
        
        
        for(int i=1;i<=5; i++)
        {
            System.out.println("Main Thread : " + i);
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println("Interrupted Main Thread");
            }
        }
        System.out.println("Existing Main Thread");
    }

}

class NewThread implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child Thread : " + i);
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println("Child Interrupted ");
            }
        }
        
        System.out.println("Exiting Child Thread");
    }

}

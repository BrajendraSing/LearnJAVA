//Extending to the Thread class

class Main {
    public static void main(String[] args) {
       MyThread th = new MyThread();
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

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child Thread : " + i);
            try
            {
                sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println("Child Interrupted ");
            }
        }
        
        System.out.println("Exiting Child Thread");
    }
}
package first;

public class Main3 {

	public static void main(String[] args) {
		
		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");
	
		
		System.out.println("One " + t1.t.isAlive());
		System.out.println("Two " + t2.t.isAlive());
		System.out.println("Three " + t3.t.isAlive());
		
		try
		{
			System.out.println("Waiting for thread to finish");
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		
		
		
		System.out.println("One " + t1.t.isAlive());
		System.out.println("Two " + t2.t.isAlive());
		System.out.println("Three " + t3.t.isAlive());
		
		System.out.println("Exiting Main Thread");
		
	}

}

class NewThread implements Runnable
{
	Thread t;
	String name;
	
	NewThread(String name)
	{
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name + " : "+ i);
			try
			{
				t.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println(name + " Interrupted");
			}
		}
		
		System.out.println("Exiting " + name);
	}
}

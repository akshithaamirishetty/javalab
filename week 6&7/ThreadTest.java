class A implements Runnable
{
	 public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t from thread A:i="+i);
		}
		System.out.println("Exit from A");
	}
}
class B implements Runnable
{
	 public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t from thread B:i="+i);
		}
		System.out.println("Exit from B");
	}
}

class  ThreadTest
{
	public static void main(String[] args) 
	{
		A threadA=new A();
		Thread t1=new Thread(threadA);
		t1.start();
		B threadB=new B();
		Thread t2=new Thread(threadB);
		t2.start();
}
}

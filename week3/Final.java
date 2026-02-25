class A
{
	final void form()
	{
		System.out.println("this is form() of class A");
	}
}
class B extends A
{
	void form()
	{
		System.out.println("this is form() of class B");
	}
		
}
class Final 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.form();
	}
}

class A 
{
	int i,j;
	void showij()
	{
		System.out.println("i and j:"+i+" "+j);
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k:"+k);
    }  
	void sum()
	{
		System.out.println("i+j+k="+ (i+j+k));
	}
}
class SimpleInheritance
{
	public static void main(String[] args) 
	{
		A superOb=new A();
		superOb.i=10;
		superOb.j=20;
		superOb.showij();
		B subOb=new B();
		subOb.i=100;
		subOb.j=200;
		subOb.k=300;
		subOb.showij();
		subOb.showk();
		subOb.sum();
	}
}

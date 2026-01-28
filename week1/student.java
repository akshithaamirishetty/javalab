class student 
{
	int rollNo;
	String name;
	String branch;
	int marks;
	void getdata(int rollNo,String name,String branch,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("RollNo:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Marks:"+marks);
	}
	
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student();
		s1.getdata(1,"A","cse",100);
		s2.getdata(2,"B","it",200);
		s1.display();
		s2.display();
	}
}

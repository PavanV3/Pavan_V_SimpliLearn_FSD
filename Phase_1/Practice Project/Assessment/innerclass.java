package Assessment;

public class innerclass {

	private int data=30; 
	private int t,c=23;
	
	void display()
	{
		System.out.println("i am inside the outer class method");
	}
	void add()
	{
		  t=data+c;
		  System.out.println("Total: "+t);
	  }
	 
	class Inner1{  		
	 private int data=20;
	  
	  void msg()
	  {
		  innerclass.this.display();
		  System.out.println("Value of data: "+data);
	  }  
	  
	  void display()
	  {
		  System.out.println("1st inner class method");
	  }
	  
	 }  
	class Inner2
	{
		int a=10;
		void msg()
		{
			innerclass.this.add();
			System.out.println("Value of a: "+a);
		}
		void display()
		{
			System.out.println("2nd inner class method");
		}
	}
	public static void main(String args[]){  
	  
		innerclass obj=new innerclass();   	
	  
		innerclass.Inner1 in=obj.new Inner1();
		innerclass.Inner2 i=obj.new Inner2();
	  in.msg();  
	  in.display(); 
	  i.msg();
	  i.display();
	  
	 }
	 
	} 

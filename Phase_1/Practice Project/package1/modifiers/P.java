package package1.modifiers;

public class P {
	public void publicmethod() 
	{
		System.out.println("public method of class P");
	}
	protected void protectmethod()
	{
		System.out.println("protected method of class P");
	}
	private void privatemethod()
	{
		System.out.println("private method of class P");
	}
	void defaultmethod()
	{
		System.out.println("default method of class P");
	}
	public static void main(String[] args) 
	{
		M obj=new M();
		N obj1=new N();
		// methods called from N to P
		obj1.publicmethod(); 
		obj1.protectmethod();
		obj1.defaultmethod();
		
		System.out.println(obj1.k);
		System.out.println(obj.b);
		
		System.out.println("Value of M variable is "+ new M().c);
		System.out.println("Value of M variable is "+ new M().b);
		System.out.println("Value of N variable is "+ new N().k);

	}

}

package package1.modifiers;

public class M
{
	private int a=12;
	long b=13;
	protected float c=14;
	public void publicmethod() 
	{
		System.out.println("public method of class M");
	}
	protected void protectmethod()
	{
		System.out.println("protected method of class M");
	}
	private void privatemethod()
	{
		System.out.println("private method of class M");
	}
	void defaultmethod()
	{
		System.out.println("default method of class M");
	}
	
}	
package Assessment;

public class constructor
{

	double i;
	float j;
	public constructor()
	{
		System.out.println("default constructor");
	}
	constructor(int a)
	{
		int s=a*a;
		System.out.println("Area of square:"+s);
	}
	constructor(int h , int b)
	{
		int r=(h*b);
		System.out.println("Area of Rectangle:"+r);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		constructor c1= new constructor(4);
		constructor c2= new constructor(6,7);
	
	}

}
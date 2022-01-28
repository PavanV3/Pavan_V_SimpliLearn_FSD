package Assessment;


import java.io.IOException;
import java.util.Scanner;

public class searchstring {
	@SuppressWarnings("resource")
	public static void main (String [] arg) throws IOException{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String");
		String Path =sc.nextLine();
		if (Path.length() <= 15 )
	{
		System.out.println("The size of the string Is under StringSize");
		System.out.println("The Lenth Of String is : "+Path.length());
		
	}
	else {
		System.out.println("Out of String Size");	
		System.out.println("The Lenth Of String is : "+Path.length());
	}
}
}
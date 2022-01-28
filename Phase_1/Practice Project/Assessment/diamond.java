package Assessment;

interface First 
{  
    default void show() 
    { 
    	System.out.println("default first interface"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("default second interface"); 
    } 
}  

public class diamond implements First, Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond td = new diamond(); 
        td.show(); 


	}

}
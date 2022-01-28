package Assessment;

public class linearsearch {
   
public static int linearSearch(int[] arr, int key)
{    
		for(int i=0;i<arr.length;i++)
		{    
		if(arr[i] == key){    
		return i;    
		}    
		}    
		 return -1;    
}    
 public static void main(String a[])
 {    
	int[] a1= {11,22,33,55,77,99};    
	int key = 99;    
	System.out.println(key+" is found at index: "+linearSearch(a1, key));    
 }    
} 

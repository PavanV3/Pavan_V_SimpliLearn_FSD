package Assessment;
import java.util.*;
public class maps {

    public static void main(String[] args) {
	        
	         HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	          hm.put(1,"Pavan");    
	          hm.put(2,"Mani");    
	          hm.put(3,"Rajesh");   
	           
	          System.out.println("Hashmap Contains: ");  
	          for(Map.Entry m:hm.entrySet())
	          {    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	              
	          Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	          ht.put(4,"Krishnagiri");  
	          ht.put(5,"Hosur");  
	          ht.put(6,"Panruti");  
	          ht.put(7,"Chennai");  

	          System.out.println("\nHashTable Contains: ");  
	          for(Map.Entry n:ht.entrySet())
	          {    
	           System.out.println(n.getKey()+" "+n.getValue());    
	          }
	          
	          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	          map.put(8,"Bangalore");    
	          map.put(9,"Pune");    
	          map.put(10,"Mumbai");       
	          
	          System.out.println("\nTreeMap  Contains: ");  
	          for(Map.Entry l:map.entrySet())
	          {    
	           System.out.println(l.getKey()+" "+l.getValue());    
	          }    
	          
	       }  
}
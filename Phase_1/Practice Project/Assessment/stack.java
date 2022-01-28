package Assessment;

import java.util.Stack;

public class stack {


		public static void main(String[] args)
		{
			Stack s = new Stack();
			
			s.push("Grapes"); 
		    s.push("Banana"); 
			s.push("Apple");
			s.push("Orange");
			s.push("Mellon");
			
			s.push("Banglore"); 
			s.push("Chennai");
			s.push("Delhi");
			s.push("Mumbai");
			
			s.push(4); 
			s.push(6);
			s.push(8);
			s.push(9);
			
			s.push('s');
			s.push('p');
			
			System.out.println(s);
			
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			
			System.out.println("After removing 5 elements: "+s);
			
			System.out.println("The element at the top of the stack is: " + s.peek());
			
			s.pop();
			s.pop();
			System.out.println("After removing 2 elements: "+s);
			s.pop();
			s.pop();
			System.out.println("After poll of 2 elements: "+s);
			
			System.out.println("The element at the top of the stack is: " + s.peek());
			
			System.out.println("index of elemtn All inside the stack: "+ s.indexOf("Delhi"));
			System.out.println("index of elemtn All inside the stack: "+ s.indexOf("Apple"));
		}

	}


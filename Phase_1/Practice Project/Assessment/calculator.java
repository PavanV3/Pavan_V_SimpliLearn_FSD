package Assessment;

import java.util.Scanner;

public class calculator{
  public static void main(String[] args) {

    char operator;
    Double num1, num2, result;

    
    Scanner input = new Scanner(System.in);  

 
    System.out.println("Choose an operator: A, S, M, D or P");
    operator = input.next().charAt(0);

    	   
    System.out.println("Enter first number");
    num1 = input.nextDouble();

    System.out.println("Enter second number");
    num2 = input.nextDouble();

    switch (operator) {

      
      case 'A':
        result = num1 + num2;
        System.out.println( "Addtion of two numbres: " + result);  
        break;

      
      case 'S':
        result = num1 - num2;
        System.out.println("Subtraction of two numbres: " + result); 
        break;

	      case 'M':
        result = num1 * num2;
        System.out.println("Multiplication of two numbres: " + result); 
        break;

      
      case 'D':
        result = num1 / num2;
        System.out.println("Division of two numbres: " + result); 
        break;

        
      case 'P':
	        result = num1 % num2;
	        System.out.println("Modulus of two numbres: " + result); 
	        break;
	        
	        
      default:
        System.out.println("Invalid Operator!!!!");
        break;
    }

    input.close();
  }
}
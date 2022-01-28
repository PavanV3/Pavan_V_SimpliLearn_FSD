package Assessment;
import java.util.Scanner;
public class stringsearch 
{
    public static void main(String[] args)
    {
        String[] arr={"mani","hari","pavan"};
        System.out.println("Enter the string to search :");
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i].equals(str))
            {
                System.out.println("The string is present in the array");
                break;
            }
            else 
            {
                System.out.println("String Not found");
                break;
            }
        }
    }
}